create database PayrollManagementStudio

use PayrollManagementStudio

create table Users (
id int primary key identity(1,1),
username varchar(50),
password varchar(50)
)

insert into Users values('Admin','1234')

create table Employee(
emp_id int primary key identity(1,1),
emp_name varchar(50),
emp_fname varchar(50),
emp_address varchar(50), 
emp_phn varchar(50),
emp_mbl varchar(50),
emp_dob date,
emp_nid varchar(50),
emp_gender varchar(50),
emp_status varchar(50),
emp_title varchar(50),
emp_dept varchar(50),
emp_shift varchar(50),
emp_joined date,
emp_salary numeric(18, 2),
emp_img image
)

create table Company(
c_id int primary key identity(1,1),
c_name varchar(50) not null,
c_address varchar(50),
c_phone varchar(50),
c_header varchar(50),
c_footer varchar(50),
c_logo image
)

create table Shift(
s_id int primary key identity(1,1),
s_name varchar(50) not null,
s_start varchar(50),
s_end varchar(50)
)

create table Department(
department_id int primary key identity(1,1),
department_name varchar(50) not null
)

insert into Department
values('Accounts and Finance'),('HR'),('Sales and marketing'),('Infrastructures'),('Research and development'),
      ('Learning and development'),('IT services'),('Product development'),('Admin department'),('Security and transport')


create table Leave(
emp_id int not null foreign key references Employee(emp_id),
leave_id int primary key identity(1,1),
leave_type varchar(50) not null,
start_date date,
end_date date,
days int,
reason varchar(50)
)

create table Overtime(
emp_id int not null foreign key references Employee(emp_id),
overtime_id int primary key identity(1,1),
enroll_date date,
start_time varchar(50),
end_time varchar(50),
minute varchar(50),
rate_per_hour varchar(50),
total_amount numeric(18, 2)
)

create table Deduction(
emp_id int not null foreign key references Employee(emp_id),
deduction_id int primary key identity(1,1),
enroll_date date,
deduction_factor varchar(50),
amount numeric(18, 2)
)

create table Allowance(
emp_id int not null foreign key references Employee(emp_id),
allowance_id int primary key identity(1,1),
enroll_date date,
allowance varchar(50),
amount numeric(18, 2)
)

create table Attendance(
emp_id int not null foreign key references Employee(emp_id),
attendance_id int primary key identity(1,1),
attendance_date date,
attendance_shift varchar(50),
time_in varchar(50),
)

create table CashAdvance(
emp_id int not null foreign key references Employee(emp_id),
advance_id int primary key identity(1,1),
advance_date date,
comment varchar(50),
amount numeric(18, 2)
)

create table Payroll(
emp_id int not null foreign key references Employee(emp_id),
pay_id int primary key identity(1,1),
salary_date date,
salary_from date,
salary_to date,
total_days int null,
present_days int null,
basic_salary decimal(18, 2) null,
overtime decimal(18, 2) null,
allowance decimal(18, 2) null,
bonus decimal(18, 2) null,
gross_pay decimal(18, 2) null,
deduction decimal(18, 2) null,
advance decimal(18, 2) null,
income_tax decimal(18, 2) null,
net_salary decimal(18, 2) null
)

SELECT Employee.emp_salary as baseSalary, SUM(Allowance.amount) as allowanceAmount, SUM(Deduction.amount), SUM(CashAdvance.amount) FROM Employee 
RIGHT JOIN Overtime ON Employee.emp_id = Overtime.emp_id 
RIGHT JOIN Allowance ON Employee.emp_id = Allowance.emp_id 
RIGHT JOIN Deduction ON Employee.emp_id = Deduction.emp_id 
RIGHT JOIN CashAdvance ON Employee.emp_id = CashAdvance.emp_id 
WHERE Employee.emp_id = 11
AND Overtime.enroll_date BETWEEN '2022-08-01' AND '2022-08-31'
AND Allowance.enroll_date BETWEEN '2022-08-01' AND '2022-08-31' 
AND Deduction.enroll_date BETWEEN '2022-08-01' AND '2022-08-31'
AND CashAdvance.date1 BETWEEN '2022-08-01' AND '2022-08-31' 
GROUP BY Employee.emp_salary;

select * from Allowance inner join Employee on Allowance.emp_id = Employee.emp_id;