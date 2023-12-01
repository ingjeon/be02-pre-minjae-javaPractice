package day05;

public class Str {
    public static void main(String[] args)  {

        String str1 = "안녕";
        String str2 = "하세요";

        int empNo = 10000;
        int salaryAvg = 90000;

        System.out.println(str1 + str2);
        String sql = "SELECT emp_no, AVG(salary) " +
                "FROM salaries " +
                "WHERE emp_no >= " + empNo + " " +
                "GROUP BY emp_no " +
                "HAVING AVG(salary) > " + salaryAvg + ";";
        System.out.println(sql);


        //. #, -
        String str3 = "abc.def#ghi-";
        System.out.println(str3);
        str3 = str3.replace(".", "!");
        System.out.println(str3);
        str3 = str3.replace("#", "!");
        System.out.println(str3);
        str3 = str3.replace("-", "!");
        System.out.println(str3);

        // .csv 파일 ,로 구분하는 데이터를 표 형태로 저장하는 파일의 파일 확장자
        String str4 = "abc:def:ghi";
        String[] strArr = str4.split(":");
        for(int i=0; i< strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        // 빈칸을 표현식으로 변경
        // %d : 숫자, %s : 글자
        String str5 = "SELECT emp_no, AVG(salary) " +
                "FROM salaries " +
                "WHERE emp_no >= %d " +
                "GROUP BY emp_no " +
                "HAVING AVG(salary) > %d;";
        // String.format(빈칸 뚫어둔 글자, 빈칸에 들어갈 변수)
        System.out.println(
                String.format(str5, empNo, salaryAvg)
                // str문자열 %d %d에 순서대로 empNo,salaryAvg 채워짐
        );


    }
}
