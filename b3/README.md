# Best Practices Used
* Object Orientation <br>
* Design Pattern <br>
* Clean Code <br>
* Behaviour Driven Development <br>

# Question First
* 3 Test Cases

# Question Second
| Test Case | Description                                                   | Condition                          | Message                                   |
| --------- | ------------------------------------------------------------- |------------------------------------| ----------------------------------------- |
| 1         | In this case, C is greater than both A and B.                 | C > A and C > B  | "C must be smaller than at least one number"                |
| 2         | In this case, C is greater than A but less than or equal to B.| C > A and C <= B | "Proceed to the next step"                                  |
| 3         | In this case, C is less than or equal to A.                   | C <= A           | "B might be smaller than C" (does not check the second if)" |

# Question Third
| Issue | Description                                                              |
| ----- | ------------------------------------------------------------------------ | 
| 1     | In the first variable, you can be more specific and use the double type. |
| 2     | In the second variable, you can be more specific and use the double type.|
| 3     | In the third variable, you can be more specific and use the double type. |
| 4     | You are performing a calculation that will always have the result zero.  |

# Question Fourth
```python
public List<Person> FindBornPeople(int yearMonthDayStart, int yearMonthDayEnd)
{
    using (var db = new people(@"c:\people.mdf"))
    {
        string query = @"SELECT Name, DateBirth
                         FROM people
                         WHERE DateBirth BETWEEN @startDate AND @endDate
                         ORDER BY DateBirth DESC";

        var result = db.Database.SqlQuery<Person>(
            query, 
            new SqlParameter("@startDate", yearMonthDayStart),
            new SqlParameter("@endDate", yearMonthDayEnd)
        ).ToList();

        return result;
    }
}
```

# Question Fifth
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