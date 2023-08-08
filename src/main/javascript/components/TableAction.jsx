import React from "react";
const TableAction = () => {
    return (
        <td colSpan={2}>
            <button type="button" className="btn btn-primary mr-2">More Information</button>
            <button type="button" className="btn btn-danger">Delete</button>
        </td>
    );
}

export default TableAction;