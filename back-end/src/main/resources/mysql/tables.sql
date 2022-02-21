/** study management's tables **/

CREATE TABLE user
(
    userID    INTEGER NOT NULL AUTO_INCREMENT,
    userName  VARCHAR(10) NOT NULL,
    gender    INTEGER CHECK (gender > 0),
    userTel   VARCHAR(11) NOT NULL,
    userEmail VARCHAR(50) NOT NULL,
    userNum   INTEGER,
    password  VARCHAR(50) NOT NULL,
    grade     INTEGER CHECK (grade > 0),
    state     INTEGER CHECK (state > 0),
    dept      VARCHAR(20) NOT NULL,
    autho     INTEGER DEFAULT 4 CHECK (autho > 0),
    PRIMARY KEY (userID)
);
set SQL_MODE="NO_AUTO_VALUE_ON_ZERO";



CREATE TABLE study
(
    studyID    INTEGER,
    studyName  VARCHAR(50)  NOT NULL,
    simpleDesc VARCHAR(100) NOT NULL,
    detail     VARCHAR(1000) DEFAULT NULL,
    recomGra   INTEGER       DEFAULT 0 CHECK (recomGra >= 0),
    maxMem     INTEGER       DEFAULT 1 CHECK (maxMem > 0),
    time       VARCHAR(20),
    isGrant    BOOLEAN       DEFAULT false,
    isQues1    BOOLEAN       DEFAULT false,
    isQues2    BOOLEAN       DEFAULT false,
    isQues3    BOOLEAN       DEFAULT false,
    addQues    VARCHAR(1000) DEFAULT NULL,
    countQues  INTEGER       DEFAULT 0 CHECK (countQues < 4),
    PRIMARY KEY (studyID)
);

CREATE TABLE weeklyPlan
(
    planID  INTEGER,
    studyID INTEGER,
    content VARCHAR(100) DEFAULT NULL,
    isCheck BOOLEAN      DEFAULT FALSE,
    PRIMARY KEY (planID),
    FOREIGN KEY (studyID) REFERENCES study (studyID)
);

CREATE TABLE monthlyPlan
(
    planID  INTEGER,
    studyID INTEGER,
    content VARCHAR(100) DEFAULT NULL,
    isCheck BOOLEAN      DEFAULT FALSE,
    PRIMARY KEY (planID),
    FOREIGN KEY (studyID) REFERENCES study (studyID)
);

CREATE TABLE studyNotice
(
    noID      INTEGER,
    studyID   INTEGER,
    title     VARCHAR(50)   DEFAULT NULL,
    content   VARCHAR(1000) DEFAULT NULL,
    writeDate DATE,
    PRIMARY KEY (noID),
    FOREIGN KEY (studyID) REFERENCES study (studyID)
);

CREATE TABLE studyReg
(
    regID   INTEGER,
    userID  INTEGER,
    studyID INTEGER,
    ans1    VARCHAR(1000) NOT NULL,
    ans2    VARCHAR(1000) NOT NULL,
    ans3    VARCHAR(1000) NOT NULL,
    PRIMARY KEY (regID),
    FOREIGN KEY (userID) REFERENCES user (userID),
    FOREIGN KEY (studyID) REFERENCES study (studyID)
);

CREATE TABLE studyMem
(
    userID     INTEGER,
    studyID    INTEGER,
    studyAutho INTEGER DEFAULT 0 CHECK (studyAutho > 0),
    FOREIGN KEY (userID) REFERENCES user (userID),
    FOREIGN KEY (studyID) REFERENCES study (studyID)
);

CREATE TABLE post
(
    postID  INTEGER,
    studyID INTEGER,
    userID  INTEGER,
    title   VARCHAR(50)   NOT NULL,
    date    DATE,
    viewCnt INTEGER DEFAULT 0,
    comCnt  INTEGER DEFAULT 0,
    content VARCHAR(1000) NOT NULL,
    PRIMARY KEY (postID),
    FOREIGN KEY (userID) REFERENCES user (userID),
    FOREIGN KEY (studyID) REFERENCES study (studyID)
);

CREATE TABLE comment
(
    comID   INTEGER,
    userID  INTEGER,
    postID  INTEGER,
    date    DATE,
    content VARCHAR(1000) NOT NULL,
    PRIMARY KEY (comID),
    FOREIGN KEY (userID) REFERENCES user (userID),
    FOREIGN KEY (postID) REFERENCES post (postID)
);

ALTER TABLE weeklyPlan ADD date VARCHAR(10) NOT NULL;
ALTER TABLE weeklyplan MODIFY planID INTEGER NOT NULL AUTO_INCREMENT;

ALTER TABLE monthlyPlan ADD date VARCHAR(10) NOT NULL;
ALTER TABLE monthlyPlan MODIFY planID INTEGER NOT NULL AUTO_INCREMENT;