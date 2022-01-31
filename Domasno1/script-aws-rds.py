import mysql.connector as mysql
import csv

if __name__ == "__main__":

    #  conenct to database
    db_connection = mysql.connect(
        host="dians-hw-monuments.cturmiwwynta.us-east-1.rds.amazonaws.com",
        user="das_monument_usr",
        password="9PqY8bux8UHRM5zq",
        database="dians_hw_monuments"
    )
    mysql_cursor = db_connection.cursor()

    temp_first = True
    with open('./monuments.csv', 'r', encoding='utf-8') as file:
        csv_monuments = csv.reader(file)

        for data in csv_monuments:
            print(data)
            if temp_first:
                temp_first = False
            else:
                mysql_cursor.execute(
                    'insert into MONUMENTS(id, name, lon, lat, addr_street, wikipedia) values (%s, %s, %s, %s, %s, %s)', 
                    data
                )
        db_connection.commit()

    mysql_cursor.execute("SELECT * FROM MONUMENTS;")
    myresult = mysql_cursor.fetchall()
    for x in myresult:
        print(x)

    db_connection.close()
