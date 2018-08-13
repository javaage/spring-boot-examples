# Spring Boot 中使用 MongoDB 增删改查

[Spring Boot 中使用 MongoDB 增删改查](http://www.ymq.io/2018/02/05/spring-boot-mongodb-example/)

[http://www.ymq.io/2018/02/05/spring-boot-mongodb-example](http://www.ymq.io/2018/02/05/spring-boot-mongodb-example/)

### Contact

 - 作者：鹏磊  
 - 出处：[http://www.ymq.io](http://www.ymq.io)  
 - Email：[admin@souyunku.com](admin@souyunku.com)  
 - 版权归作者所有，转载请注明出处
 - Wechat：关注公众号，搜云库，专注于开发技术的研究与知识分享
 
![关注公众号-搜云库](http://www.ymq.io/images/souyunku.png "搜云库")


db.createUser(
  {
    user: "admin",
    pwd: "zgzz2025",
    roles: [ { role: "userAdminAnyDatabase", db: "admin" } ]
  }
)

db.grantRolesToUser("admin", [{role: "dbOwner", db: "test" }]);

db.createCollection('var_setting')
db.createCollection('var_value')

netstat -tunlp|grep mongo
mongod --config /var/lib/mongodb/conf/rs2.conf &

netstat -tunlp|grep mongo
mongod --config /var/lib/mongodb/conf/rs2.conf &


db.createUser({
user:'sa',
pwd:'zgzz2025',
roles:[
{role:'readAnyDatabase',db:'admin'}
]})


db.createUser(
...   {
...     user: "dba",
...     pwd: "dba",
...     roles: [ { role: "userAdminAnyDatabase", db: "admin" } ]
...   }
... )

use zgzz
db.createUser(
   {
     user: "sa1",
     pwd: "zgzz2025",
     roles: [ "readWrite", "dbAdmin" ]
   }
)

use zgzz
db.createUser(
   {
     user: "zgzz",
     pwd: "zgzz2025",
     roles: [ "readWrite", "dbAdmin" ]
   }
)













{
        "_id" : "admin.admin",
        "user" : "admin",
        "db" : "admin",
        "credentials" : {
                "SCRAM-SHA-1" : {
                        "iterationCount" : 10000,
                        "salt" : "PIZfKgqtjPFs/DHVKoHyag==",
                        "storedKey" : "q0i6GNStgLjDIeHBtWqOJeLi6bY=",
                        "serverKey" : "jCCffSmXK6xDks0MRwQWEtWlg6A="
                },
                "SCRAM-SHA-256" : {
                        "iterationCount" : 15000,
                        "salt" : "zUu8PMLrxyrCpxAzevOE8M6W+1sepmQfjvefjQ==",
                        "storedKey" : "VrvuZS6bzwjaQNi+l+Y5Wac/aodcBVMr7mHgGCfbqRg=",
                        "serverKey" : "uh/UB0ZMAmq0ccZCJUqOS8VlI9m97qwWEo1bwVcCWWA="
                }
        },
        "roles" : [
                {
                        "role" : "dbOwner",
                        "db" : "local"
                },
                {
                        "role" : "dbOwner",
                        "db" : "test"
                },
                {
                        "role" : "userAdminAnyDatabase",
                        "db" : "admin"
                }
        ]
}
{
        "_id" : "zgzz.sa",
        "user" : "sa",
        "db" : "zgzz",
        "credentials" : {
                "SCRAM-SHA-1" : {
                        "iterationCount" : 10000,
                        "salt" : "Rap5+VpoT6mNH/+GLEU3yQ==",
                        "storedKey" : "4lE4vOIgiklpayUfIY/RBze5YRs=",
                        "serverKey" : "7h2oELrGxdZ8f9HgQIdPnPK/RG4="
                },
                "SCRAM-SHA-256" : {
                        "iterationCount" : 15000,
                        "salt" : "61pmrATRdTeQCZ19hwviffp92AOt0E5zbLs+Nw==",
                        "storedKey" : "+YPdzEfpaiijVgRq4PSJluZjVB8Hiyk5o8fpfolPfPk=",
                        "serverKey" : "g8Cf7nJm46tC7D8FGH654JWaICp6rWqH7O7wF61btEA="
                }
        },
        "roles" : [
                {
                        "role" : "sysadmin",
                        "db" : "admin"
                }
        ]
}
{
        "_id" : "zgzz.sa1",
        "user" : "sa1",
        "db" : "zgzz",
        "credentials" : {
                "SCRAM-SHA-1" : {
                        "iterationCount" : 10000,
                        "salt" : "ZVUsr66wWqEP/+f/PVb1rg==",
                        "storedKey" : "VFF0MA4/C49RHVvaIZqTt3J8l8o=",
                        "serverKey" : "1bcQ3VKN4pCWeqETQMEOojyv6Co="
                },
                "SCRAM-SHA-256" : {
                        "iterationCount" : 15000,
                        "salt" : "VJZeFuNex5QfAc89j3wwAgLdCOE5IP+B9rGOvA==",
                        "storedKey" : "mwZRvp4VxER9fGHpRFARXyYd/qrON0/Lehgd96m7rfQ=",
                        "serverKey" : "DJoglaKelsJF2poQvVUOrt2+bHUM0wdHPPU9T2NOT6g="
                }
        },
        "roles" : [
                {
                        "role" : "readWrite",
                        "db" : "zgzz"
                },
                {
                        "role" : "dbAdmin",
                        "db" : "zgzz"
                }
        ]
}
{
        "_id" : "zgzz.zgzz",
        "user" : "zgzz",
        "db" : "zgzz",
        "credentials" : {
                "SCRAM-SHA-1" : {
                        "iterationCount" : 10000,
                        "salt" : "1SWju0QcDl+/N/St+POZjA==",
                        "storedKey" : "Ujo/0+MMPIH5Pt4P1e8iNAi6Jt4=",
                        "serverKey" : "hlvdSzgqkqX6VjcJhnOmlXKEt9Y="
                },
                "SCRAM-SHA-256" : {
                        "iterationCount" : 15000,
                        "salt" : "baLOB6R46Ya/5u91g8eDsWldSfA9CohaQwjKtw==",
                        "storedKey" : "uCUB5OmOBrwQooqq/rEG1lNbn2LoDfchrxUEX15HuGY=",
                        "serverKey" : "yFs9BOvbhQQ+BNAc9Er10nZfzs21kU0MD6+IyTtepHo="
                }
        },
        "roles" : [
                {
                        "role" : "readWrite",
                        "db" : "zgzz"
                },
                {
                        "role" : "dbAdmin",
                        "db" : "zgzz"
                }
        ]
}
>


