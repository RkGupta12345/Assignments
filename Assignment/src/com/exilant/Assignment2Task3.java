package com.exilant;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment2Task3 {

public static int calculate(String spreadsheetPath) throws Exception {
String line = "";
int sum = 0;
try (BufferedReader br = new BufferedReader(new FileReader(new File(spreadsheetPath)))) {
while ((line = br.readLine()) != null) {
sum = sum + calculateSum(line);

}
}

return sum;
}

private static int calculateSum(String row) {
	int difference=0;
//row = row.replace(",", "");
List<Integer> list = new ArrayList<>();
Arrays.stream(row.split(",")).sorted().forEach(i -> list.add(Integer.parseInt(i)));
Collections.sort(list);
System.out.println(list);
int max=list.get(list.size() - 1);
int min=list.get(0);	
difference =max-min;
System.out.println(difference);
return difference;
}

public static void main(String[] args) throws Exception {
System.out.println(calculate("/Users/ravi.kumar/Documents/workspace-sts-3.9.4.RELEASE/Assignment/src/input.txt"));
}

}

