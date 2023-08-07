import React from "react";
const Table = ({data}) => {
    console.log(data);
    return (
        <table className="table table-striped table-hover">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Course ID</th>
                <th scope="col">Course Name</th>
                <th scope="col">Course Coordinator</th>
                <th scope="col">Action</th>
            </tr>
            </thead>

            <tbody>
                {data?.map((data)=> {
                    return (
                        <tr>
                            <th scope="row">{data.id}</th>
                            <td>{data.courseId}</td>
                            <td>{data.courseName}</td>
                            <td>{data.courseCoordinator}</td>
                            <td colSpan={2}>
                                <button type="button" className="btn btn-primary mr-2">More Information</button>
                                <button type="button" className="btn btn-danger">Delete</button>
                            </td>
                        </tr>
                    )
                })}
            </tbody>
        </table>
    );
}

export default Table;