# Write your MySQL query statement below
select score , rn as 'rank' from (
    select score , DENSE_RANK() over (order by score desc) as rn
    from Scores
) t
