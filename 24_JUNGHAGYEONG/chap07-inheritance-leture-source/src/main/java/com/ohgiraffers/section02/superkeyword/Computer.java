package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    /* computer는 하나의 Product이지만 Product는 Computer가 아니다. (IS-A)*/
    private String cpu;
    private int ssd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본생성자 호출");
    }

    public Computer(String cpu, int ssd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brnd, String name, int price, Date manufactureDate, String cpu, int ssd, int ram, String operationSystem) {
        super(code, brnd, name, price, manufactureDate);
        this.cpu = cpu;
        this.ssd = ssd;
        this.ram = ram;
        this.operationSystem = operationSystem;
//        this(cpu,ssd,ram,operationSystem);
        /*
        * 위에 처럼 사용하고싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        * super()를 두번 호출하는 것과 같기때문에 허용 XX
        * 부모 인스턴스를 두개 생성할 수 없기 때문에 부모생성자는 한번만 호출 함
        * */
    }

    /*
    * setter와 getter는 부모필드의 메소드에 대해서는 자신의 것처럼 사용가능하기 때문에
    * 따로 작성할 필요없이 부모클래스에 작성한 것을 사용할 수 있음
    * 따라서 자식 클래스에 추가된 필드에 대해서만 setter/getter를 작성함
    * */

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        /*
        * super.getInformation() : 정상적으로 부모의 메소드를 호출
        * this.getInformation() : 본인의 getInformation() 호출 -> 재귀호출이 일어나며 stackoverflow가 발생
        * getInformation() : this.이 자동 추가되어 재귀호출이 일어나고 stackoverflow발생
        * 다라서 이런 경우 super.을 명시적으로 사용해야함
        * */

        return super.getInformation()
                + ", cpu = " + this.cpu
                + ", ssd = " + this.ssd
                + ", ram = " + this.ram
                + ", operationSystem = " + this.operationSystem;
    }
}
