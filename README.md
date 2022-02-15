Joshi                     Dinesh                         38000

SQL> Last Name First Name Salary --------------- --------------- ----------- Markis Marcia $25,000.00
SP2-0734: unknown command beginning "Last Name ..." - rest of line ignored.
SQL> Amin Hyder $25,000.00
SP2-0734: unknown command beginning "Amin Hyder..." - rest of line ignored.
SQL> Prescott Sherri $25,000.00
SP2-0734: unknown command beginning "Prescott S..." - rest of line ignored.
SQL> Bock Douglas $30,000.00
SP2-0734: unknown command beginning "Bock Dougl..." - rest of line ignored.
SP2-0044: For a list of known commands enter HELP
and to leave enter EXIT.
SQL> Joshi Dinesh $38,000.00
SP2-0734: unknown command beginning "Joshi Dine..." - rest of line ignored.
SQL> SELECT emp_last_name "Last Name", emp_salary "Salary"
  2  FROM employee
  3  WHERE emp_salary NOT BETWEEN 28000 AND 50000
  4  ORDER BY emp_salary;

Last Name                     Salary
------------------------- ----------
Markis                         25000
Prescott                       25000
Amin                           25000
Bordoloi                       55000

SQL> Last Name Salary --------------- ----------- Markis $25,000.00
SP2-0734: unknown command beginning "Last Name ..." - rest of line ignored.
SQL> Amin $25,000.00
SP2-0734: unknown command beginning "Amin $25,0..." - rest of line ignored.
SQL> Prescott $25,000.00
SP2-0734: unknown command beginning "Prescott $..." - rest of line ignored.
SQL> Bordoloi $55,000.00
SP2-0734: unknown command beginning "Bordoloi $..." - rest of line ignored.
SP2-0044: For a list of known commands enter HELP
and to leave enter EXIT.
SQL> SELECT *
  2  FROM assignment
  3  WHERE work_hours IS NULL;

WORK_EMP_ WORK_PRO_NUMBER WORK_HOURS
--------- --------------- ----------
999444444               1
999666666              20

SQL> WORK_EMP_ WORK_PRO_NUMBER WORK_HOURS --------- --------------- ---------- 999444444 1
SP2-0734: unknown command beginning "WORK_EMP_ ..." - rest of line ignored.
SQL> 999666666 20
SQL> SELECT *
  2  FROM assignment
  3  WHERE work_hours IS NULL;

WORK_EMP_ WORK_PRO_NUMBER WORK_HOURS
--------- --------------- ----------
999444444               1
999666666              20

SQL> WORK_EMP_ WORK_PRO_NUMBER WORK_HOURS --------- --------------- ---------- 999444444 1
SP2-0734: unknown command beginning "WORK_EMP_ ..." - rest of line ignored.
SQL> 999666666 20
SQL> SELECT *
  2  FROM employee;

EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME
--------- ------------------------- -------------------------
EMP_MIDDLE_NAME           EMP_ADDRESS
------------------------- --------------------------------------------------
EMP_CITY                  EM EMP_ZIP   EMP_DATE EMP_SALARY EMP_PARKING_SPACE E
------------------------- -- --------- -------- ---------- ----------------- -
EMP_DPT_NUMBER EMP_SUPER
-------------- ---------
999666666 Bordoloi                  Bijoy
                          South Main #12
Edwardsville              IL 62025     10/11/67      55000                 1 M
             1


EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME
--------- ------------------------- -------------------------
EMP_MIDDLE_NAME           EMP_ADDRESS
------------------------- --------------------------------------------------
EMP_CITY                  EM EMP_ZIP   EMP_DATE EMP_SALARY EMP_PARKING_SPACE E
------------------------- -- --------- -------- ---------- ----------------- -
EMP_DPT_NUMBER EMP_SUPER
-------------- ---------
999555555 Joyner                    Suzanne
A                         202 Burns Farm
Marina                    CA 93941     20/06/71      43000                 3 F
             3 999666666


EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME
--------- ------------------------- -------------------------
EMP_MIDDLE_NAME           EMP_ADDRESS
------------------------- --------------------------------------------------
EMP_CITY                  EM EMP_ZIP   EMP_DATE EMP_SALARY EMP_PARKING_SPACE E
------------------------- -- --------- -------- ---------- ----------------- -
EMP_DPT_NUMBER EMP_SUPER
-------------- ---------
999444444 Zhu                       Waiman
Z                         303 Lindbergh
St. Louis                 MO 63121     08/12/75      43000                32 M
             7 999666666


EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME
--------- ------------------------- -------------------------
EMP_MIDDLE_NAME           EMP_ADDRESS
------------------------- --------------------------------------------------
EMP_CITY                  EM EMP_ZIP   EMP_DATE EMP_SALARY EMP_PARKING_SPACE E
------------------------- -- --------- -------- ---------- ----------------- -
EMP_DPT_NUMBER EMP_SUPER
-------------- ---------
999887777 Markis                    Marcia
M                         High St. #14
Monterey                  CA 93940     19/07/78      25000               402 F
             3 999555555


EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME
--------- ------------------------- -------------------------
EMP_MIDDLE_NAME           EMP_ADDRESS
------------------------- --------------------------------------------------
EMP_CITY                  EM EMP_ZIP   EMP_DATE EMP_SALARY EMP_PARKING_SPACE E
------------------------- -- --------- -------- ---------- ----------------- -
EMP_DPT_NUMBER EMP_SUPER
-------------- ---------
999222222 Amin                      Hyder
                          S. Seaside Apt. B
Marina                    CA 93941     29/03/69      25000               422 M
             3 999555555


EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME
--------- ------------------------- -------------------------
EMP_MIDDLE_NAME           EMP_ADDRESS
------------------------- --------------------------------------------------
EMP_CITY                  EM EMP_ZIP   EMP_DATE EMP_SALARY EMP_PARKING_SPACE E
------------------------- -- --------- -------- ---------- ----------------- -
EMP_DPT_NUMBER EMP_SUPER
-------------- ---------
999111111 Bock                      Douglas
B                         #2 Mont Verd Dr.
St. Louis                 MO 63121     01/09/55      30000               542 M
             7 999444444


EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME
--------- ------------------------- -------------------------
EMP_MIDDLE_NAME           EMP_ADDRESS
------------------------- --------------------------------------------------
EMP_CITY                  EM EMP_ZIP   EMP_DATE EMP_SALARY EMP_PARKING_SPACE E
------------------------- -- --------- -------- ---------- ----------------- -
EMP_DPT_NUMBER EMP_SUPER
-------------- ---------
999333333 Joshi                     Dinesh
                          #10 Oak St.
Collinsville              IL 66234     15/09/72      38000               332 M
             7 999444444


EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME
--------- ------------------------- -------------------------
EMP_MIDDLE_NAME           EMP_ADDRESS
------------------------- --------------------------------------------------
EMP_CITY                  EM EMP_ZIP   EMP_DATE EMP_SALARY EMP_PARKING_SPACE E
------------------------- -- --------- -------- ---------- ----------------- -
EMP_DPT_NUMBER EMP_SUPER
-------------- ---------
999888888 Prescott                  Sherri
C                         Overton Way #4
Edwardsville              IL 62025     31/07/72      25000               296 F
             7 999444444


8 rows selected.

SQL> EMP_SSN EMP_LAST_NAME EMP_FIRST_NAME EMP_MIDDLE_NAME ------------ ------------------------ ------------------------- --------------------------- 999666666 Bordoloi Bijoy
SP2-0734: unknown command beginning "EMP_SSN EM..." - rest of line ignored.
SQL> 999555555 Joyner Suzanne A
SQL> 999444444 Zhu Waiman Z
SQL> more rows and columns will be displayed
SP2-0734: unknown command beginning "more rows ..." - rest of line ignored.
SQL> SELECT emp_ssn, emp_last_name, emp_first_name
  2  FROM employee;

EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME
--------- ------------------------- -------------------------
999666666 Bordoloi                  Bijoy
999555555 Joyner                    Suzanne
999444444 Zhu                       Waiman
999887777 Markis                    Marcia
999222222 Amin                      Hyder
999111111 Bock                      Douglas
999333333 Joshi                     Dinesh
999888888 Prescott                  Sherri

8 rows selected.

SQL> SELECT emp_salary
  2  FROM employee;

EMP_SALARY
----------
     55000
     43000
     43000
     25000
     25000
     30000
     38000
     25000

8 rows selected.

SQL> EMP_SALARY ----------------- $55,000.00
SP2-0734: unknown command beginning "EMP_SALARY..." - rest of line ignored.
SQL> $43,000.00
'43' is not recognized as an internal or external command,
operable program or batch file.

SQL> $43,000.00
'43' is not recognized as an internal or external command,
operable program or batch file.

SQL> $25,000.00
'25' is not recognized as an internal or external command,
operable program or batch file.

SQL> $25,000.00
'25' is not recognized as an internal or external command,
operable program or batch file.

SQL> $30,000.00
'30' is not recognized as an internal or external command,
operable program or batch file.

SQL> $38,000.00
'38' is not recognized as an internal or external command,
operable program or batch file.

SQL> $25,000.00
'25' is not recognized as an internal or external command,
operable program or batch file.

SQL> 8 rows selected.
SQL>
SQL> SELECT DISTINCT emp_salary
  2  FROM employee;

EMP_SALARY
----------
     38000
     55000
     43000
     30000
     25000

SQL> EMP_SALARY ------------------- $25,000.00
SP2-0734: unknown command beginning "EMP_SALARY..." - rest of line ignored.
SQL> $30,000.00
'30' is not recognized as an internal or external command,
operable program or batch file.

SQL> $38,000.00
'38' is not recognized as an internal or external command,
operable program or batch file.

SQL> $43,000.00
'43' is not recognized as an internal or external command,
operable program or batch file.

SQL> $55,000.00
'55' is not recognized as an internal or external command,
operable program or batch file.

SQL> SELECT emp_ssn, emp_last_name, emp_first_name, emp_salary
  2  FROM employee
  3  WHERE emp_salary >= 35000;

EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME            EMP_SALARY
--------- ------------------------- ------------------------- ----------
999666666 Bordoloi                  Bijoy                          55000
999555555 Joyner                    Suzanne                        43000
999444444 Zhu                       Waiman                         43000
999333333 Joshi                     Dinesh                         38000

SQL> EMP_SSN EMP_LAST_NAME EMP_FIRST_NAME EMP_SALARY -------------- -------------------------- --------------------------- ------------------- 999666666 Bordoloi Bijoy $55,000.00
SP2-0734: unknown command beginning "EMP_SSN EM..." - rest of line ignored.
SQL> 999555555 Joyner Suzanne $43,000.00
SQL> 999444444 Zhu Waiman $43,000.00
SQL> more rows will be displayed…
SP2-0734: unknown command beginning "more rows ..." - rest of line ignored.
SQL> SELECT emp_ssn, emp_last_name, emp_first_name
  2  FROM employee
  3  WHERE emp_gender = 'M';

EMP_SSN   EMP_LAST_NAME             EMP_FIRST_NAME
--------- ------------------------- -------------------------
999666666 Bordoloi                  Bijoy
999444444 Zhu                       Waiman
999222222 Amin                      Hyder
999111111 Bock                      Douglas
999333333 Joshi                     Dinesh

SQL> SELECT emp_last_name, emp_first_name
  2  FROM employee
  3  WHERE emp_last_name >= 'J'
  4  ORDER BY emp_last_name;

EMP_LAST_NAME             EMP_FIRST_NAME
------------------------- -------------------------
Joshi                     Dinesh
Joyner                    Suzanne
Markis                    Marcia
Prescott                  Sherri
Zhu                       Waiman

SQL> EMP_LAST_NAME EMP_FIRST_NAME ------------------------- -------------------------- Joshi Dinesh
SP2-0734: unknown command beginning "EMP_LAST_N..." - rest of line ignored.
SQL> Joyner Suzanne
SP2-0734: unknown command beginning "Joyner Suz..." - rest of line ignored.
SQL> Markis Marcia
SP2-0734: unknown command beginning "Markis Mar..." - rest of line ignored.
SQL> more rows will be displayed
SP2-0734: unknown command beginning "more rows ..." - rest of line ignored.
SP2-0044: For a list of known commands enter HELP
and to leave enter EXIT.
SQL> …
SQL> SELECT emp_dpt_number, emp_last_name, emp_first_nam
  2  e
  3  FROM employee
  4  ORDER BY emp_dpt_number, emp_last_name;
SELECT emp_dpt_number, emp_last_name, emp_first_nam
                                      *
ERROR at line 1:
ORA-00904: "EMP_FIRST_NAM": invalid identifier


SQL> EMP_DPT_NUMBER EMP_LAST_NAME EMP_FIRST_NAME ---------------------------- -------------------------- --------------- 1 Bordoloi Bijoy
SP2-0734: unknown command beginning "EMP_DPT_NU..." - rest of line ignored.
SQL> 3 Amin Hyder
SQL> 3 Joyner Suzanne
SQL> 3 Markis Marcia
SQL> 7 Bock Douglas
SQL> 7 Joshi Dinesh
SQL> 7 Prescott Sherri
SQL> 7 Zhu Waiman
SQL> SELECT emp_dpt_number, emp_last_name, emp_first_nam
  2  e
  3  FROM employee
  4  ORDER BY emp_dpt_number, emp_last_name;
SELECT emp_dpt_number, emp_last_name, emp_first_nam
                                      *
ERROR at line 1:
ORA-00904: "EMP_FIRST_NAM": invalid identifier


SQL> EMP_DPT_NUMBER EMP_LAST_NAME EMP_FIRST_NAME ---------------------------- -------------------------- --------------- 1 Bordoloi Bijoy
SP2-0734: unknown command beginning "EMP_DPT_NU..." - rest of line ignored.
SQL> 3 Amin Hyder
SQL> 3 Joyner Suzanne
SQL> 3 Markis Marcia
SQL> 7 Bock Douglas
SQL> 7 Joshi Dinesh
SQL> 7 Prescott Sherri
SQL> 7 Zhu Waiman
SQL> SELECT emp_last_name "Last Name",
  2  emp_first_name "First Name",
  3  emp_salary "Salary"
  4  FROM employee
  5  WHERE emp_salary IN (43000, 30000, 25000)
  6  ORDER BY emp_salary;

Last Name                 First Name                    Salary
------------------------- ------------------------- ----------
Markis                    Marcia                         25000
Amin                      Hyder                          25000
Prescott                  Sherri                         25000
Bock                      Douglas                        30000
Zhu                       Waiman                         43000
Joyner                    Suzanne                        43000

6 rows selected.

SQL> Last Name First Name Salary --------------- --------------- ----------- Markis Marcia $25,000.00
SP2-0734: unknown command beginning "Last Name ..." - rest of line ignored.
SQL> Amin Hyder $25,000.00
SP2-0734: unknown command beginning "Amin Hyder..." - rest of line ignored.
SQL> Prescott Sherri $25,000.00
SP2-0734: unknown command beginning "Prescott S..." - rest of line ignored.
SQL> Bock Douglas $30,000.00
SP2-0734: unknown command beginning "Bock Dougl..." - rest of line ignored.
SP2-0044: For a list of known commands enter HELP
and to leave enter EXIT.
SQL> Joyner Suzanne $43,000.00
SP2-0734: unknown command beginning "Joyner Suz..." - rest of line ignored.
SQL> Zhu Waiman $43,000.00
SP2-0734: unknown command beginning "Zhu Waiman..." - rest of line ignored.
SQL> 6 rows selected.
SQL> SELECT emp_last_name "Last Name",
  2  emp_first_name "First Name",
  3  emp_salary "Salary"
  4  FROM employee
  5  WHERE emp_salary NOT IN (43000, 30000, 25000)
  6  ORDER BY emp_salary;

Last Name                 First Name                    Salary
------------------------- ------------------------- ----------
Joshi                     Dinesh                         38000
Bordoloi                  Bijoy                          55000

SQL> Last Name First Name Salary --------------- --------------- ----------- Joshi Dinesh $38,000.00
SP2-0734: unknown command beginning "Last Name ..." - rest of line ignored.
SQL> Bordoloi Bijoy $55,000.00
SP2-0734: unknown command beginning "Bordoloi B..." - rest of line ignored.
SQL> SELECT emp_last_name "Last Name",
  2  emp_first_name "First Name",
  3  emp_salary "Salary"
  4  FROM employee
  5  WHERE emp_salary BETWEEN 25000 AND 40000
  6  ORDER BY emp_salary;

Last Name                 First Name                    Salary
------------------------- ------------------------- ----------
Markis                    Marcia                         25000
Amin                      Hyder                          25000
Prescott                  Sherri                         25000
Bock                      Douglas                        30000
Joshi                     Dinesh                         38000

SQL> Last Name First Name Salary --------------- --------------- ----------- Markis Marcia $25,000.00
SP2-0734: unknown command beginning "Last Name ..." - rest of line ignored.
SQL> Amin Hyder $25,000.00
SP2-0734: unknown command beginning "Amin Hyder..." - rest of line ignored.
SQL> Prescott Sherri $25,000.00
SP2-0734: unknown command beginning "Prescott S..." - rest of line ignored.
SQL> Bock Douglas $30,000.00
SP2-0734: unknown command beginning "Bock Dougl..." - rest of line ignored.
SP2-0044: For a list of known commands enter HELP
and to leave enter EXIT.
SQL> Joshi Dinesh $38,000.00
SP2-0734: unknown command beginning "Joshi Dine..." - rest of line ignored.
SQL> SELECT emp_last_name "Last Name", emp_salary "Salary"
  2  FROM employee
  3  WHERE emp_salary NOT BETWEEN 28000 AND 50000
  4  ORDER BY emp_salary;

Last Name                     Salary
------------------------- ----------
Markis                         25000
Prescott                       25000
Amin                           25000
Bordoloi                       55000

SQL> Last Name Salary --------------- ----------- Markis $25,000.00
SP2-0734: unknown command beginning "Last Name ..." - rest of line ignored.
SQL> Amin $25,000.00
SP2-0734: unknown command beginning "Amin $25,0..." - rest of line ignored.
SQL> Prescott $25,000.00
SP2-0734: unknown command beginning "Prescott $..." - rest of line ignored.
SQL> Bordoloi $55,000.00
SP2-0734: unknown command beginning "Bordoloi $..." - rest of line ignored.
SP2-0044: For a list of known commands enter HELP
and to leave enter EXIT.
SQL> SELECT *
  2  FROM assignment
  3  WHERE work_hours IS NULL;

WORK_EMP_ WORK_PRO_NUMBER WORK_HOURS
--------- --------------- ----------
999444444               1
999666666              20

SQL> WORK_EMP_ WORK_PRO_NUMBER WORK_HOURS --------- --------------- ---------- 999444444 1
SP2-0734: unknown command beginning "WORK_EMP_ ..." - rest of line ignored.
SQL> 999666666 20
SQL> SELECT *
  2  FROM assignment
  3  WHERE work_hours IS NULL;

WORK_EMP_ WORK_PRO_NUMBER WORK_HOURS
--------- --------------- ----------
999444444               1
999666666              20

SQL> WORK_EMP_ WORK_PRO_NUMBER WORK_HOURS --------- --------------- ---------- 999444444 1
SP2-0734: unknown command beginning "WORK_EMP_ ..." - rest of line ignored.
SQL> 999666666 20
SQL> CREATE TABLE department (
  2  dpt_no NUMBER(2)
  3  CONSTRAINT pk_department PRIMARY KEY,
  4  dpt_name VARCHAR2(20)
  5  CONSTRAINT nn_dpt_name NOT NULL
  6  );
CREATE TABLE department (
             *
ERROR at line 1:
ORA-00955: name is already used by an existing object


SQL> CREATE TABLE department (
  2  dpt_no NUMBER(2)
  3  CONSTRAINT pk_department PRIMARY KEY,
  4  dpt_name VARCHAR2(20)
  5  CONSTRAINT nn_dpt_name NOT NULL
  6  );
CREATE TABLE department (
             *
ERROR at line 1:
ORA-00955: name is already used by an existing object


SQL> CREATE TABLE employee (
  2  emp_ssn CHAR(9)
  3  CONSTRAINT pk_employee PRIMARY KEY,
  4  emp_last_name VARCHAR2(25)
  5  CONSTRAINT nn_emp_last_name NOT NULL,
  6  emp_first_name VARCHAR2(25)
  7  CONSTRAINT nn_emp_first_name NOT NULL,
  8  emp_date_of_birth DATE,
  9  emp_salary NUMBER(7,2)
 10  CONSTRAINT ck_emp_salary
 11  CHECK (emp_salary <= 85000),
 12  emp_parking_space NUMBER(4)
 13  CONSTRAINT un_emp_parking_space UNIQUE,
 14  emp_gender CHAR(1),
 15  emp_dpt_number NUMBER(2),
 16  CONSTRAINT fk_emp_dpt FOREIGN KEY (emp_dpt_number)
 17  REFERENCES department ON DELETE SET NULL
 18  );
CREATE TABLE employee (
             *
ERROR at line 1:
ORA-00955: name is already used by an existing object


SQL> INSERT INTO simpleEmployeeTabke (emp_ssn,
  2  emp_last_name, emp_first_name)
  3  VALUES ('999111111', 'Bock',
  4  'Douglas');
INSERT INTO simpleEmployeeTabke (emp_ssn,
            *
ERROR at line 1:
ORA-00942: table or view does not exist


SQL>
