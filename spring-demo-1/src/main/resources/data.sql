
INSERT INTO course(ID,DEPARTMENT_NAME, INSTRUCTOR_ID,DURATION,NAME, CREATED_DATE, LAST_UPDATED_DATE)
    VALUES (1001,'CSE', 1, 15,'SQL',sysdate(),sysdate());

INSERT INTO course(ID,DEPARTMENT_NAME, INSTRUCTOR_ID,DURATION,NAME,CREATED_DATE, LAST_UPDATED_DATE) VALUES
(1002,'ESE', 1, 15,'SQL', sysdate(),sysdate());

INSERT INTO course(ID,DEPARTMENT_NAME, INSTRUCTOR_ID,DURATION,NAME, CREATED_DATE, LAST_UPDATED_DATE) VALUES
 (1003,'ESE', 1, 15,'SQL', sysdate(),sysdate());


INSERT INTO passport (ID, NUMBER) VALUES (4001,'E1200031');
INSERT INTO passport (ID, NUMBER) VALUES (4002,'E1200032');
INSERT INTO passport (ID, NUMBER) VALUES (4003,'E1200033');
INSERT INTO passport (ID, NUMBER) VALUES (4004,'E1200034');

INSERT INTO review (ID, RATING, DESCRIPTION, COURSE_ID) VALUES (5001,'5', 'gREAT',1001);
INSERT INTO review (ID, RATING, DESCRIPTION,COURSE_ID) VALUES (5002,'2', 'poor',1001);
INSERT INTO review (ID, RATING, DESCRIPTION,COURSE_ID) VALUES (5003,'4', 'Average',1002);

INSERT INTO student(ID,FIRST_NAME, LAST_NAME,PHONE_NUMBER,PASSPORT_ID ) VALUES (1001,'Santhosh', 'V', 12345698,4001);
INSERT INTO student(ID,FIRST_NAME, LAST_NAME,PHONE_NUMBER,PASSPORT_ID ) VALUES (1002,'Pradeep', 'R', 9876543215,4002);
INSERT INTO student(ID,FIRST_NAME, LAST_NAME,PHONE_NUMBER,PASSPORT_ID ) VALUES (1003,'Pavi', 'P', 9879516235,4004);
INSERT INTO student(ID,FIRST_NAME, LAST_NAME,PHONE_NUMBER,PASSPORT_ID ) VALUES (1004,'Dinesk', 'K', 987123549,4003);
