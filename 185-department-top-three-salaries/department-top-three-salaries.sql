# Write your MySQL query statement below
select d.name as  Department , e.name as Employee  , e.salary as Salary from (
    select *,DENSE_RANK() over (partition by departmentid order by salary desc) as rn
    from employee 
) e  join department d
on e.departmentid=d.id
where rn<=3;