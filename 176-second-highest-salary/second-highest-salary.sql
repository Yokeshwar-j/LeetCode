# Write your MySQL query statement below
select MAX(salary) as SecondHighestSalary from(
    select id,salary,DENSE_RANK() over (order by salary desc ) as rn
    from Employee
) t
where rn=2;
#using max or min return a scalar which includes null to
#if no max or min we wont have any return value for example 2