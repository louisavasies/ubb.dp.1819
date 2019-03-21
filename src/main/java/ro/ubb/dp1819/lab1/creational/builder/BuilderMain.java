package ro.ubb.dp1819.lab1.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        SqlQueryBuilder demo = new SqlQueryBuilder();

        String resultQuery = demo
                .select("STUDENTS")
                .where("GRADES < 5")
                .build();
        System.out.println(resultQuery);
    }
}
