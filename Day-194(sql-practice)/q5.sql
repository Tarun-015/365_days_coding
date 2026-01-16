-- Get Nth Record per Group (Without Window Functions)

-- Table: Sales(emp_id, sale_amount, region)

SELECT s1.region, MAX(s1.sale_amount) AS second_highest
FROM Sales s1
WHERE 2 = (
  SELECT COUNT(DISTINCT s2.sale_amount)
  FROM Sales s2
  WHERE s2.region = s1.region AND s2.sale_amount >= s1.sale_amount
)
GROUP BY s1.region;
