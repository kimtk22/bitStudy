use scott;
### ORACLE
select count(*) from emp;
select count(*) from dept;
select count(*) from emp, dept;

# cross join
select A.empno, A.ename, A.deptno, B.deptno, B.dname, B.loc from emp A, dept B;
# equi join
select A.empno, A.ename, A.deptno, B.deptno, B.dname, B.loc from emp A, dept B where A.deptno = B.deptno;
# non-equi join
select A.empno, A.ename, A.deptno, B.deptno, B.dname, B.loc from emp A, dept B where A.deptno != B.deptno;
# outer join
select A.empno, A.ename, A.deptno, B.deptno, B.dname, B.loc from emp A, dept B where A.deptno = B.deptno;
# self join
select A.empno, A.ename, A.mgr, B.ename from emp A, emp B where A.mgr=B.empno;

### ANCI
# cross join
select * from emp cross join dept;
# inner join
select * from emp inner join dept on emp.deptno = dept.deptno;
select * from emp inner join dept on emp.deptno = dept.deptno where emp.deptno=20;
select * from emp inner join dept using (deptno);
select * from emp natural join dept;
# outter join
select * from emp right outer join dept using(deptno);
select * from dept left outer join emp using(deptno);
select * from emp full join dept using(deptno);
select * from dept left outer join emp using(deptno);
# self join
select * from emp;
select A.empno, A.ename, A.mgr, B.ename from emp A inner join emp B on A.mgr=B.empno;