# Questionnaire

# First
For the following code, how many test cases are needed to cover all conditions (True and False)?

```python
READ A
READ B
READ C
	IF C > A THEN
	IF C > B THEN
		PRINT “C must be smaller than at least one number”
	ELSE
		PRINT “Proceed to the next step”
	ENDIF
	ELSE
		PRINT “B might be smaller than C”
END IF
```
* 3 Test Cases

# Second
Based on the above question, describe the tests you considered regarding it.

| Test Case | Description                                                   | Condition                          | Message                                   |
| --------- | ------------------------------------------------------------- |------------------------------------| ----------------------------------------- |
| 1         | In this case, C is greater than both A and B.                 | C > A and C > B  | "C must be smaller than at least one number"                |
| 2         | In this case, C is greater than A but less than or equal to B.| C > A and C <= B | "Proceed to the next step"                                  |
| 3         | In this case, C is less than or equal to A.                   | C <= A           | "B might be smaller than C" (does not check the second if)" |

# Third
Do you see any problems in the code below?

```python
try
{
	var quantityBuyers = 0;
	var totalPrice = 1475.89;

	var priceForBuyer = totalPrice / quantityBuyers;

		return priceForBuyer;
}
catch (Exception ex)
{
		throw ex;
}
```

| Issue | Description                                                              |
| ----- | ------------------------------------------------------------------------ | 
| 1     | In the first variable, you can be more specific and use the double type. |
| 2     | In the second variable, you can be more specific and use the double type.|
| 3     | In the third variable, you can be more specific and use the double type. |
| 4     | You are performing a calculation that will always have the result zero.  |

> [!NOTE]
> When you try to use this method, the following error message will be displayed: `Java.lang.ExceptionInInitializerError`.

# Fourth
How do I obtain the names of all people born from 1980 onwards from the collection below?

```python
var people = new[] {
	new { Name = "José", DateBirth = new DateTime(1982,03,27), Active = true},
	new { Name = "Leandro", DateBirth = new DateTime(1978,04,03), Active = false},
	new { Name = "Pedro", DateBirth = new DateTime(1980,05,24), Active = true}
	};
}
```

```python
public List<Person> FindBornPeople(DateTime startDate)
{
	try
	{
		using (var db = new People(@"c:\people.mdf"))
		{
			string query = @"SELECT Name, DateBirth
							FROM people
							WHERE DateBirth >= @startDate
							ORDER BY DateBirth DESC";

			var result = db.Database.SqlQuery<Person>(
				query, 
				new SqlParameter("@startDate", startDate)
			).ToList();

			return result;
			
		}	
	}
	catch (Exception ex)
	{
	
		throw new Exception("Error while querying people in the database", ex);
		
	}
}

var peopleBornFrom1980 = FindBornPeople(new DateTime(1980, 1, 1));
```

# Fifth
What are the GIT commands to submit the new code to the version control repository?

```python
git status
```

```python
git add .
```

```python
git commit –m "I am adding all project in the main repository."
```

```python
git push origin main
```

> [!TIP]
> In the Eclipse IDE, you need to add the four commands below in the Arguments tab by accessing the 'Run' menu and selecting the 'Run Configurations'> option.

```python
--add-opens java.desktop/java.awt.font=ALL-UNNAMED
```

```python
--add-opens java.base/java.text=ALL-UNNAMED
```

```python
--add-opens java.base/java.lang.reflect=ALL-UNNAMED
```

```python
--add-opens java.base/java.util=ALL-UNNAMED
```