# Write your MySQL query statement below
SELECT w.id FROM Weather w, Weather w1
WHERE w.temperature > w1.temperature AND dATEDIFF(w.recordDate, w1.recordDate) = 1