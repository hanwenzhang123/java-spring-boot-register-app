package university.seeds;

import university.models.Course;
import university.services.CourseService;

public class SeedCourseData {
    public SeedCourseData(CourseService repository) {
        repository.save(new Course("cs520",
                "Information Structures with Java", "Kalathur"));
        repository.save(new Course("cs521",
                "Information Structures with Python", "Pinsky"));
        repository.save(new Course("cs526",
                "Data Structures and Algorithms", "Raghu"));
        repository.save(new Course("cs601",
                "Web Application Development", "Sheehan"));
        repository.save(new Course("cs602",
                "Server Side Web Development", "Sheehan"));
        repository.save(new Course("cs622",
                "Advanced Programming Techniques", "Braude"));
        repository.save(new Course("cs632",
                "Information Technology Project Management", "Kanabar"));
        repository.save(new Course("cs633",
                "Software Quality, Testing, and Security Management ", "Elentukh"));
        repository.save(new Course("cs634",
                "Agile Software Development", "Kanabar"));
        repository.save(new Course("cs664",
                "Artificial Intelligence", "Braude"));
        repository.save(new Course("cs665",
                "Software Design and Patterns", "Kalathur"));
        repository.save(new Course("cs674",
                "Database Security", "Zhang"));
        repository.save(new Course("cs673",
                "Software Engineering", "Zhang"));
        repository.save(new Course("cs677",
                "Data Science with Python", "Enxing"));
        repository.save(new Course("cs682",
                "Information Systems Analysis and Design", "Williams"));
        repository.save(new Course("cs683",
                "Mobile Application Development with Android", "Zhang"));
        repository.save(new Course("cs701",
                "Rich Internet Application Development", "Winderbaum"));
        repository.save(new Course("cs763",
                "Secure Software Development", "Zhang"));
        repository.save(new Course("cs767",
                "Advanced Machine Learning and Neural Networks", "Rawassizadeh"));
        repository.save(new Course("cs783",
                "Enterprise Architecture", "Williams"));
    }
}

//https://www.bu.edu/met/degrees-certificates/ms-computer-science/#degree