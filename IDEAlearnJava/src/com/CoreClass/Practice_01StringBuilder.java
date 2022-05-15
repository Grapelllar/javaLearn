package com.CoreClass;

public class Practice_01StringBuilder {
    public static void main(String[] args) {

        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert = buildInsertSql(table,fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }
    static String buildInsertSql(String table, String[] fields){
        // TODO:
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ")
                .append(table)
                .append(" (" + fields[0] + ", ")
                .append(fields[1] + ", ")
                .append(fields[2] + ")")
                .append(" VALUES (?, ?, ?)");
        return sb.toString();
    }
}


