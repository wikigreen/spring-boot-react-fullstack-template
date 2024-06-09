import React, { FormEvent, useCallback, useState } from "react";
import { Task as TaskType } from "../../type";

type TaskProps = {
	task?: TaskType;
	onDelete?: (id: number) => Promise<void>;
	onEditCancel?: () => void;
	onUpdate: (task: TaskType) => Promise<void>;
	editMode?: boolean;
};

export const Task: React.FC<TaskProps> = ({
	task,
	onUpdate,
	onDelete,
	onEditCancel,
	editMode: editModeProp = false,
}) => {
	const [editMode, setEditMode] = useState(editModeProp);

	const handleSubmit = useCallback(
		(event: FormEvent<HTMLFormElement>) => {
			event.preventDefault();
			console.log("dfsdf");
			onUpdate({
				...task,
				description: (event.currentTarget[0] as HTMLFormElement).value,
			}).then(() => setEditMode(false));
		},
		[onUpdate, task],
	);

	return (
		<div>
			{!editMode && <span>{task?.description}</span>}
			{editMode && (
				<form onSubmit={handleSubmit}>
					<label>
						Name:
						<input type="text" name="name" />
					</label>
					<input type="submit" value="Submit" />
				</form>
			)}
			{!editMode && <button onClick={() => setEditMode(true)}>Edit</button>}
			{editMode && (
				<button
					onClick={() => {
						onEditCancel?.();
						setEditMode(false);
					}}
				>
					Cancel
				</button>
			)}
			{!editMode && (
				<button onClick={() => onDelete?.(task?.id ?? 0)}>Delete</button>
			)}
		</div>
	);
};
