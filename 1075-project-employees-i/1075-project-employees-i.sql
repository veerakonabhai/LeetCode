# Write your MySQL query statement below
select Project.project_id, ROUND(SUM(experience_years) / COUNT(*), 2) as average_years
from Project join Employee 
on project.employee_id = Employee.employee_id
group by project_id