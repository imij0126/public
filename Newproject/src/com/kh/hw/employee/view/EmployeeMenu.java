package com.kh.hw.employee.view;

import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.model.vo.Employee;

import java.util.Scanner;

public class EmployeeMenu {
    private Scanner sc = new Scanner(System.in);
    private EmployeeController ec = new EmployeeController();

    public EmployeeMenu() {
        while (true) {
            System.out.println("1. 사원 추가 ");
            System.out.println("2. 사원 수정 ");
            System.out.println("3. 사원 삭제 ");
            System.out.println("4. 사원 출력 ");
            System.out.println("9. 프로그램 종료 ");
            System.out.print("번호를 입력하세요 : ");
            int num1 = sc.nextInt();
            switch (num1) {
                case 1 :
                    insertEmp();
                    break;
                case 2 :
                    updateEmp();
                    break;
                case 3 :
                    deleteEmp();
                    break;
                case 4 :
                    printEmp();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력하세요.");
            }
        }
    }
    public void insertEmp(){
        System.out.print("사원 번호 : ");
        int empNo =  sc.nextInt();

        sc.nextLine(); // 단순 호출로 버퍼에 \n 제거

        System.out.print("사원 이름 : ");
        String Name = sc.nextLine();
        System.out.print("사원 성별 : ");
        char gender =sc.next().charAt(0);
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
        String yn= sc.next();
        //if(yn.equals("y")|| yn.equals("Y")){
        if (yn.toUpperCase().equals("Y")){ //toUpperCase 문자열의 값을 모두 대문자로 변경
            //tolowercase() 문자열의 값을 모두 소문자로 변경
            System.out.print("사원 부서 : ");
            String dept = sc.next();
            sc.nextLine();
            System.out.print("사원 연봉 : ");
            int salary = sc.nextInt();
            System.out.print("보너스 율 : ");
            double Bonus = sc.nextDouble();
            ec.add(empNo,Name,gender,phone,dept,salary,Bonus);
        }else {
            ec.add(empNo,Name,gender,phone); // 기본정보만 사원 추가
        }
        System.out.println("사원 정보가 추가되었습니다.");
    }
    public void updateEmp() {
        System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.\n사원의 어떤 정보를 수정하시겠습니까?");
        System.out.println("1. 전화번호");
        System.out.println("2. 사원연봉");
        System.out.println("3. 보너스 율");
        System.out.println("9. 돌아가기");
        System.out.print("메뉴 번호를 누르세요 : ");
        int num1 = sc.nextInt();
        sc.nextLine();
        switch (num1) {
            case 1:
                System.out.println("수정할 전화 번호 : ");
                String phone = sc.nextLine();
                ec.modify(phone);
                System.out.println("전화번호가 수정되었습니다.");
                break;
            case 2:
                System.out.println("수정할 연봉 : ");
                int salary = sc.nextInt();
                ec.modify(salary);
                System.out.println("연봉이 수정되었습니다.");
                break;
            case 3:
                System.out.println("수정할 보너스 율 : ");
                double Bonus = sc.nextDouble();
                System.out.println("보너스가 수정되었습니다.");
                break;
            case 9:
                System.out.println("메인 메뉴로 돌아갑니다.");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
            }
    }

    public void deleteEmp(){
        System.out.print("정말 삭제하시겠습니까? :");
        char remove = sc.next().charAt(0);
        if(remove == 'y' || remove == 'Y'){
            Employee removed = ec.remove();
            if (removed != null) {
                System.out.println("사원 정보가 삭제되었습니다.");
            } else {
                System.out.println("삭제할 사원 정보가 없습니다.");
            }
        } else {
            System.out.println("삭제가 취소되었습니다.");
        }
    }
    public void printEmp(){String info = ec.inform();
        if (info != null) {
            System.out.println(info);
        } else {
            System.out.println("사원 데이터가 없습니다.");
        }
    }
}
