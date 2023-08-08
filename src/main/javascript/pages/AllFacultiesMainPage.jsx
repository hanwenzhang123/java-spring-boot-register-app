import React, {useState, useEffect} from "react";
import TableHeader from "../components/TableHeader"
import NewRecordButton from "../components/NewRecordButton";
import TableAction from "../components/TableAction";
const AllCoursesMainPage = () => {
    const [facultyData, setFacultyData] = useState([]);
    useEffect(() => {
        const loadData = () => {
            fetch("http://localhost:8888/api/faculties")
                .then(response => response.json())
                .then(data => {
                    console.log(data);
                    setFacultyData(data);
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

            <table className="table table-striped table-hover">
                <TableHeader data={["ID"]} />
                <tbody>
                {facultyData?.map((data)=> {
                    return (
                        <tr>
                            <th scope="row">{data.id}</th>
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