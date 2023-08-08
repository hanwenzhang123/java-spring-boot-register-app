import React, {useState, useEffect} from "react";
import TableHeader from "../components/TableHeader"
import TableAction from "../components/TableAction";
import NewRecordButton from "../components/NewRecordButton";

const AllCoursesMainPage = () => {
    const [courseData, setCourseData] = useState([]);
    useEffect(() => {
        const loadData = () => {
            fetch("http://localhost:8888/api/courses")
                .then(response => response.json())
                .then(data => {
                    console.log(data);
                    setCourseData(data);
                })
        };

        loadData();
    }, [])

    return (
        <div className="main-page">
            <div
                style={{
                    display: "flex",
                    flexDirection: "row",
                    justifyContent: "space-between",
                    alignItems: "center",
                }}
            >
                <h1>All Courses</h1>
                <NewRecordButton />
            </div>

            <table className="table table-striped table-hover">
                <TableHeader data={["ID", "Course ID", " Course Name", "Faculty"]} />
                <tbody>
                {courseData?.map((data)=> {
                    return (
                        <tr>
                            <th scope="row">{data.id}</th>
                            <td>{data.courseId}</td>
                            <td>{data.courseName}</td>
                            <td>{data.courseCoordinator}</td>
                            <TableAction />
                        </tr>
                    )
                })}
                </tbody>
            </table>
        </div>
    );
}

export default AllCoursesMainPage;