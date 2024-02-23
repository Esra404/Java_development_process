public class Employee {

    String name;
    int salary=3000;
    int workHous;
    int hireYear=2021;
    int anaMaas;
    int ekstra;

    Employee(String name,int salary,int workHous,int hireYear,int anaMaas){
        this.name=name;
        this.salary=salary;
        this.workHous=workHous;
        this.hireYear=hireYear;
        this.anaMaas=anaMaas;
    }

    int tax(){
        if(salary>1000){
            anaMaas=salary-salary*(3/100);
        }

        return 0;
    }

    int bonus(){
        if(workHous>40){
            ekstra=workHous-40;
            anaMaas=anaMaas+(ekstra*30);
        }
        return 0 ;

    }
   int  raiseSalar(){
        if(hireYear<10){

        }if(hireYear>9 && hireYear<20){

       }if (hireYear>19){

       }


       return 0;
    }
    public String toString(){

        return null;
    }
}
