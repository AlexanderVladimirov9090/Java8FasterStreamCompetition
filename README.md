# Java 8 Streams Distinct List And Set Test To See Which Is Faster

This is a test to see which approach is faste, to create List with distinct values or create a Set wich the whole idea is to have no duplicated values.

## Test:
The test is to create 3 millions random integers put them in a collection. 
Then use the two approaches to filter the duplicates and see which is faster.

## The result:
Few 100 times was runned and proved that turning it to Set is near 30% faster than turning it to List. 
