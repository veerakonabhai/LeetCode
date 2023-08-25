# Write your MySQL query statement below
Select w.id from Weather w, Weather w1
where w.temperature > w1.temperature and datediff(w.recordDate, w1.recordDate) = 1