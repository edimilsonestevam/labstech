# Best Practices Used
* Object Orientation <br>
* Design Pattern <br>
* Clean Code <br>
* Behaviour Driven Development <br>

# Question First
* 4 Test Cases

# Question Second
| Test Case | Description                                | Condition | 
| --------- | ------------------------------------------ |---------- |
| 1         | A test case to verify the first condition  | C > A     |
| 2         | A test case to verify the second condition | C > B     |
| 3         | A test case to verify the third condition  | C < A     |
| 4         | A test case to verify the fourth condition | C < B     |

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
git push --all
```

```python
git commit –m"I am adding all project in the main repository."
```