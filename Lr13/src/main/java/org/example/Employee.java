package org.example;

class Employee {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не должно быть пустым");
        }
        this.name = name;
    }

    private String position;
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    private double salary;
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary <= 0) {
            throw new InvalidSalaryException("Зарплата должна быть больше 0");
        }
        this.salary = salary;
    }

    private String department;
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String name, String position, double salary, String department)
            throws InvalidSalaryException {
        setName(name);
        setPosition(position);
        setSalary(salary);
        setDepartment(department);
    }

    public void promote(String newPosition) throws PromotionException {
        if (position.equals(newPosition)) {
            throw new PromotionException("Уже на этой должности!");
        }
        setPosition(newPosition);
    }

    public void changeDepartment(String newDept) throws DepNotFoundException {
        if (newDept.equals("TestDep")) {
            throw new DepNotFoundException("Отдел не найден: " + newDept);
        }
        setDepartment(newDept);
    }

    @Override
    public String toString() {
        return name + " ," + position + ", " + salary + ", " + department + " ";
    }
}
