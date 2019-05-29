
import java.io.IOException;
import java.sql.*;
import java.io.FileWriter;
public class Connect
{
    public static void main(String[] args) throws IOException {

     //   add10000with20iterations();
//        add100with20iterations();
//        add1000with20iterations();
//        add10000_with20iterations();
        add100with20iterations();
        update5000();
    }
    public static void add10000with20iterations() throws IOException
    {
           // LatencyMeasure lm = new LatencyMeasure(1000000);
            long timeForAll20 = 0;
            //latency , how fast the content can be transfered
            for(int i = 0; i < 20 ; i++)
            {
                System.out.println(" I am in " + i + "  try ");
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection(
                                    "jdbc:mysql://localhost:3306/mydb","root","");
                            //here sonoo is database name, root is username and password
                            String sql = "INSERT INTO `mydb`.`Student` ( `name`, `date of birth`, `degree`, `programme`) VALUES ('Peter Spiderman', '1999-08-07', 'COmputer Science', 'Computer Science');";
                            Statement stmt=con.createStatement();
                       for(int j = 0; j < 10000; j++)
                       {
                           long startTime = System.nanoTime();
                               stmt.executeUpdate(sql);
                           long endTime = System.nanoTime();
                           timeForAll20 += endTime - startTime;

                       }
                            con.close();
                        }catch(Exception e){ System.out.println(e);}
            }
            FileWriter fw=new FileWriter("add10000with20iterationsLatency");
            fw.write("Time for 20 repetitions of 10000 entries to students table : "+ timeForAll20   + "\n" + " " );
            fw.close();

    }

    public static void add1000with20iterations() throws IOException
    {
        long timeForAll20 = 0;
        //latency , how fast the content can be transfered
        for(int i = 0; i < 20 ; i++)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/mydb","root","");
                //here sonoo is database name, root is username and password
                String sql = "INSERT INTO `mydb`.`Course` (`id`, `name`, `from`, `to`, `capacity`, `Teachers_id`) VALUES ('1', 'Algorithms', '2018-09-01', '2018-12-15', '60', '1');";
                Statement stmt=con.createStatement();

                for(int j = 0; j < 1000; j++)
                {
                    long startTime = System.nanoTime();
                         stmt.executeUpdate(sql);
                    long endTime = System.nanoTime();
                    timeForAll20 += endTime - startTime;
                }
                con.close();
            }catch(Exception e){ System.out.println(e);}
        }
        FileWriter fw=new FileWriter("add1000with20iterations_Latency");
        fw.write("Time for 20 repetitions of 1000 entries to courses table : "+ timeForAll20   + "\n" + " " );
        fw.close();

    }

    public static void add10000_with20iterations() throws IOException
    {
        long timeForAll20 = 0;
       // long timforAll10000 = 0;
        //latency , how fast the content can be transfered
        for(int i = 0; i < 20 ; i++)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/mydb","root","");
                //here sonoo is database name, root is username and password
                String sql = "INSERT INTO `mydb`.`Enrolments` ( `Course_id`, `Student_id`) VALUES ( '2', '2');";
                Statement stmt=con.createStatement();

                for(int j = 0; j < 10000; j++)
                {
                    long startTime = System.nanoTime();
                          stmt.executeUpdate(sql);
                    long endTime = System.nanoTime();
                    timeForAll20 += endTime - startTime;
                }
                con.close();
            }catch(Exception e){ System.out.println(e);}
        }
        FileWriter fw=new FileWriter("add10000with20iterations_Latency");
        fw.write("Time for 20 repetitions of 10000 entries to enrollment table : "+ timeForAll20   + "\n" + " " );
        fw.close();

    }

    public static void add100with20iterations() throws IOException
    {
                long timeForAll20 = 0;
                //latency , how fast the content can be transfered
                for(int i = 0; i < 20 ; i++)
                {
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/mydb","root","");
                        //here sonoo is database name, root is username and password
                        String sql = "INSERT INTO `mydb`.`Teachers` ( `name`, `specialisation`) VALUES ( 'Vanessa Dandarova', 'English');";
                        Statement stmt=con.createStatement();

                        for(int j = 0; j < 100; j++)
                        {
                            long startTime = System.nanoTime();
                            stmt.executeUpdate(sql);
                            long endTime = System.nanoTime();
                            timeForAll20 += endTime - startTime;
                        }
                        con.close();
                    }catch(Exception e){ System.out.println(e);}
                }
                FileWriter fw=new FileWriter("add100with20iterations_Latency");
                fw.write("Time for 20 repetitions of 100 entries to teachers table : "+ timeForAll20   + "\n" + " " );
                fw.close();

    }

    public static void select5000byId() throws IOException
    {
                long timeForAll20 = 0;
                //latency , how fast the content can be transfered
                for(int i = 0; i < 20 ; i++)
                {
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/mydb","root","");
                        //here sonoo is database name, root is username and password
                        String sql = "SELECT * FROM Student LIMIT 5000";
                        Statement stmt=con.createStatement();
                        ResultSet rs;

                        for(int j = 0; j < 100; j++)
                        {
                            long startTime = System.nanoTime();
                                rs = stmt.executeQuery(sql);
                            long endTime = System.nanoTime();
                            timeForAll20 += endTime - startTime;
                        }
                        con.close();
                    }catch(Exception e){ System.out.println(e);}
                }
                FileWriter fw=new FileWriter("select5000byIdLatency");
                fw.write("Time for select5000byIdLatency : "+ timeForAll20   + "\n" + " " );
                fw.close();
    }

    public static void select5000Stu_Enroll_Course_Teache() throws IOException
    {
        long timeForAll20 = 0;
        //latency , how fast the content can be transfered
        for(int i = 0; i < 20 ; i++)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/mydb","root","");
                //here sonoo is database name, root is username and password
                String sql = "select Student.id,Student.name,Course.name, Teachers.name from Student\n" +
                        "inner join Enrolments\n" +
                        "on Enrolments.Student_id = Student.id\n" +
                        "inner join Course\n" +
                        "on Enrolments.Course_id = Course.id\n" +
                        "inner join Teachers\n" +
                        "on Teachers.id = Course.Teachers_id";
                Statement stmt=con.createStatement();
                ResultSet rs;

                for(int j = 0; j < 100; j++)
                {
                    long startTime = System.nanoTime();
                    rs = stmt.executeQuery(sql);
                    long endTime = System.nanoTime();
                    timeForAll20 += endTime - startTime;
                }
                con.close();
            }catch(Exception e){ System.out.println(e);}
        }
        FileWriter fw=new FileWriter("select5000Stu_Enroll_Course_Teache_Latency");
        fw.write("Time for select5000Stu_Enroll_Course_Teache_Latency : "+ timeForAll20   + "\n" + " " );
        fw.close();
    }

    public static void select5000Stu_Enroll_Course_Teache_id_is_30() throws IOException
    {
        long timeForAll20 = 0;
        //latency , how fast the content can be transfered
        for(int i = 0; i < 20 ; i++)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/mydb","root","");
                //here sonoo is database name, root is username and password
                String sql = "select Student.id,Student.name,Course.name, Teachers.name from Student\n" +
                        "inner join Enrolments\n" +
                        "on Enrolments.Student_id = Student.id\n" +
                        "and Enrolments.Student_id = 30\n" +
                        "inner join Course\n" +
                        "on Enrolments.Course_id = Course.id\n" +
                        "inner join Teachers\n" +
                        "on Teachers.id = Course.Teachers_id";
                Statement stmt=con.createStatement();
                ResultSet rs;

                for(int j = 0; j < 100; j++)
                {
                    long startTime = System.nanoTime();
                    rs = stmt.executeQuery(sql);
                    long endTime = System.nanoTime();
                    timeForAll20 += endTime - startTime;
                }
                con.close();
            }catch(Exception e){ System.out.println(e);}
        }
        FileWriter fw=new FileWriter("select5000Stu_Enroll_Course_Teache_id_is_30");
        fw.write("Time for select5000Stu_Enroll_Course_Teache_id_is_30_Latency : "+ timeForAll20   + "\n" + " " );
        fw.close();
    }


    public static void update5000() throws IOException
    {
        long timeForAll20 = 0;
        //latency , how fast the content can be transfered
        for(int i = 0; i < 20 ; i++)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/mydb","root","");
                //here sonoo is database name, root is username and password
                String sql = " update Student set name = ? where degree = ? ";
                PreparedStatement preparedStmt = con.prepareStatement(sql);
                preparedStmt.setString   (1 , "Yoana");
                preparedStmt.setString(2 , "COmputer Science");
                //Statement stmt=con.createStatement();
                // ResultSet rs;

                for(int j = 0; j < 100; j++)
                {
                    long startTime = System.nanoTime();
                    ///  rs = stmt.executeQuery(sql);
                    preparedStmt.executeUpdate();
                    long endTime = System.nanoTime();
                    timeForAll20 += endTime - startTime;
                }
                con.close();
            }catch(Exception e){ System.out.println(e);}
        }
        FileWriter fw=new FileWriter("update5000_Latency");
        fw.write("Time for update5000_Latency : "+ timeForAll20   + "\n" + " " );
        fw.close();
    }
}

