import "./App.css";
import { useCallback, useEffect, useState } from "react";
import { Task } from "./type";
import { Task as TaskComponent } from "./components/Task";

function App() {
	const [tasks, setTasks] = useState<Task[]>([]);
	const [addMode, setAddMode] = useState(false);

	useEffect(() => {
		fetch("api/task")
			.then((res) => res.json())
			.then((tasks) => setTasks(tasks));
	}, []);

	const onDelete = useCallback(async (id: number) => {
		await fetch(`api/task/${id}`, {
			method: "DELETE",
		});
		setTasks((tasks) => tasks.filter((task) => task.id !== id));
	}, []);

	const onUpdate = useCallback(async (task: Task) => {
		const taskRes: Task = await fetch(`api/task`, {
			method: "PUT",
			headers: {
				Accept: "application/json",
				"Content-Type": "application/json",
			},
			body: JSON.stringify(task),
		}).then((res) => res.json());

		setTasks((tasks) => [
			...tasks.filter((task) => task.id !== taskRes.id),
			taskRes,
		]);
	}, []);

	const onCreate = useCallback(async (task: Task) => {
		const taskRes: Task = await fetch(`api/task`, {
			method: "POST",
			headers: {
				Accept: "application/json",
				"Content-Type": "application/json",
			},
			body: JSON.stringify(task),
		}).then((res) => res.json());

		setTasks((tasks) => [...tasks, taskRes]);
		setAddMode(false);
	}, []);

	return (
		<>
			<h1>Todo list:</h1>
			{tasks.map((task) => (
				<TaskComponent
					key={task.id}
					task={task}
					onDelete={onDelete}
					onUpdate={onUpdate}
				/>
			))}
			{addMode && (
				<TaskComponent
					editMode
					onUpdate={onCreate}
					onEditCancel={() => setAddMode(false)}
				/>
			)}
			<button onClick={() => setAddMode(true)}>Add new task</button>
		</>
	);
}

export default App;
