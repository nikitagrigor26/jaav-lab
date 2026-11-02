import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Employe{
    String fullname;
    double salary;
    public Employe(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}
class Report{
    public static void generateReport(Employe[] employees) {
        System.out.println("Отчет о зп");
        for (Employe emp : employees) {
            System.out.printf("%-15s - %10.2f%n", emp.fullname, emp.salary);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.print("Введите номер задания 1-4, 5 для выхода ");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Введите строку: ");
                    String text=scan.next();
                    System.out.printf("Ваша строка в нижнем регистре: %s",text.toLowerCase());
                    break;
                case 2:
                    System.out.print("Введите строку: ");
                    String str = scan.nextLine();
                    if (str.isEmpty()) {
                        str = scan.nextLine();
                    }
                    StringBuilder reversstr = new StringBuilder(str);
                    reversstr.reverse();
                    if(str.equals(reversstr.toString())){
                        System.out.println("Полиндром");
                    } else {
                        System.out.println("Не полиндром");
                    }
                    break;
                case 3:
                    Employe[] employees = new Employe[] {
                            new Employe("Григорьев Н.С", 55000.50),
                            new Employe("Яцына И.С", 120000.00),
                            new Employe("Шемет Э.С", 43500.753),
                            new Employe("Руденя И.А", 85000.9)
                    };
                    Report.generateReport(employees);
                    break;
                case 4:
                    String stroka="aAXa aeffa aGha aza ax23a a3sSa";
                    Pattern pattern = Pattern.compile("a[a-zA-Z]{2}a");
                    Matcher matcher = pattern.matcher(stroka);
                    while (matcher.find()) {
                        System.out.println(matcher.group());
                    }
                    break;
                case 5:
                    scan.close();
                    run=false;
                    break;
                default:
                    System.out.println("Задания с таким номером нету");
                    break;
            }
        }
    }
}