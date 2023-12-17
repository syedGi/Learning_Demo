select StoreId, _count
from (select Store_id as StoreId, count(*) as _count
    from StoreProduct
    group by Store_id) T
where _count > 0

select 
  StoreId, 
  _count 
from 
  (
    select 
      Store_id as StoreId, 
      count(*) as _count 
    from 
      StoreProduct 
    group by 
      Store_id
  ) T 
where 
  _count > 0


select 
  _count 
from 
  (
    select 
      count(*) as _count 
    from 
      EMPLOYEE
  ) T 
where 
  _count > 0
  
  
  SELECT 
  _count,
  EMP_DEPT_ID
FROM 
  (
    select 
      count(*) as _count,
      EMP_DEPT_ID
    from 
      EMPLOYEE
  ) T, 
  DEPARTMENT D 
WHERE 
  D.DEPT_ID = T.EMP_DEPT_ID