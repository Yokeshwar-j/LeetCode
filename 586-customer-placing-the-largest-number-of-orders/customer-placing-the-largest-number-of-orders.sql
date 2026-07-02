# Write your MySQL query statement below
with PP as (
    select o.customer_number,count(o.order_number) as cnt from Orders o group by customer_number
)
select customer_number from PP where cnt = 
(select max(cnt) from PP);