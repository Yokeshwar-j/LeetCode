# Write your MySQL query statement below
with te as  (
    select *,ROW_NUMBER() over (partition by email order by id) as rn from person
)
delete from person where id in (select id from te where rn>1);