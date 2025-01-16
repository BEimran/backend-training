package Day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentMarksJDBC {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/your_database";
        String user = "postgres";
        String password = "Immu@2004";
        String insertQuery = "INSERT INTO student_marks (id, name, subject, marks) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

            pstmt.setInt(1, 1);
            pstmt.setString(2, "John");
            pstmt.setString(3, "Mathematics");
            pstmt.setInt(4, 85);
            pstmt.executeUpdate();

            pstmt.setInt(1, 2);
            pstmt.setString(2, "Emily");
            pstmt.setString(3, "Science");
            pstmt.setInt(4, 92);
            pstmt.executeUpdate();

            pstmt.setInt(1, 3);
            pstmt.setString(2, "David");
            pstmt.setString(3, "English");
            pstmt.setInt(4, 78);
            pstmt.executeUpdate();

            System.out.println("Records inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
