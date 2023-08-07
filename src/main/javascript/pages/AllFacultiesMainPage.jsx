import React, {useState, useEffect} from "react";
import Table from "../components/Table"
import NewRecordButton from "../components/NewRecordButton";
const AllCoursesMainPage = () => {
    const [courseData, setCourseData] = useState([]);
    useEffect(() => {
        const loadData = () => {
            fetch("http://localhost:8888/api/courses")
                .then(response => response.json())
                .then(data => {
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
                <h1>All Faculties</h1>
                <NewRecordButton />
            </div>

            <Table data={courseData} />
        </div>
    );
}

export default AllCoursesMainPage;