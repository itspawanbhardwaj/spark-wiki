# spark-wiki

Exploring English Wikipedia pageviews by second using Apache Spark 1.5.1

## Answering the following questions 
* Total no of records
* No of rows refer to mobile
* No of rows refer to desktop
* How many total incoming request were to the mobile site vs desktop site
* How many weeks and months are there
* What is the start and end range of time for the page views data ?  How many days of data do we have ?

## Technical details
* Using Apache spark 1.5.1 with scala
* Loading 250MB tab separated file into Dataframe ()
* Caching Dataframe into memory
* Running SQL queries and sub query
* Running transformations and actions
* Creating UDF 

## Download English Wikipedia pageviews by second data
* sample-data folder contains a sample file of English Wikipedia pageviews by second data
* Download the data from https://datahub.io/dataset/english-wikipedia-pageviews-by-second and copy the file in 'sample-data' folder

## Import to eclipse
compile : sbt compile
eclipse : sbt eclipse
