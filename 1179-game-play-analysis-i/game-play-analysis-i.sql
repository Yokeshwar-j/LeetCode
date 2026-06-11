# Write your MySQL query statement below
with tab as (
    select *,ROW_NUMBER() over (partition by player_id order by event_date) as rn from Activity
)
select player_id , event_date as first_login from tab where rn = 1;