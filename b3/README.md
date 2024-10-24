# Best Practices Used
* Object Orientation <br>
* Design Pattern <br>
* Clean Code <br>
* Behaviour Driven Development <br>

# Question First
* 4 test cases

# Question Second
| Test Case | Description                                | Condition | 
| --------- | ------------------------------------------ |---------- |
| 1         | A test case to verify the first condition  | C > A     |
| 2         | A test case to verify the second condition | C > B     |
| 3         | A test case to verify the third condition  | C < A     |
| 4         | A test case to verify the fourth condition | C < B     |

# Question Third
| Description |
| ----------- | 
| In the first variable, you can be more specific and use the double type. |
| In the second variable, you can be more specific and use the double type.|
| In the third variable, you can be more specific and use the double type. |
| You are performing a calculation that will always have the result zero.  |

# Question Fourth
```python
public void FindBornPeople(int yearMonthDayStart, int yearMonthDayEnd){

	people db = new people(@”c:\people.mdf”);

	db.ExecuteCommand(
		SELECT Name
		FROM people
		WHERE DateBirth BETWEEN “yearMonthDayStart” AND “yearMonthDayEnd”
		DESC DateBirth;
	);
}
```

# Question Fifth
```python
git push --all
git commit –m"I am adding all project in the main repository."
```