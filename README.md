# Spring Data JPA Start

Demo project for spring data jpa

**关联项目**

[Vue前端](https://github.com/Meruem117/vite_vue3_start)

[React前端](https://github.com/Meruem117/react_ant_start)

[爬虫](https://github.com/Meruem117/bilibili_spider)

[Mapreduce](https://github.com/Meruem117/mapreduce_count_text)

-----

## Up


- `/up/get`

    - 请求方式: get

    - 描述: 获取up分页列表

    - 参数:

      | 字段 | 描述   | 类型   |
      | ---- | ------ | ------ |
      | start   |  起始页(从0开始)   | number |
      | size  | 每页大小 | number |
    

- `/up/all`

    - 请求方式: get

    - 描述: 获取全部up数据

    - 参数: 无
    

- `/up/add`

    - 请求方式: post

    - 描述: 增加一条up记录

    - 参数:

      | 字段 | 描述   | 类型   |
      | ---- | ------ | ------ |
      | id   | 主键   | number |
      | mid  | up主id | string |
      | name | up主名 | string |


- `/up/update`

    - 请求方式: post

    - 描述: 修改一条up记录

    - 参数:

      | 字段 | 描述   | 类型   |
      | ---- | ------ | ------ |
      | id   | 主键   | number |
      | mid  | up主id | string |
      | name | up主名 | string |


- `/up/delete`

    - 请求方式: post

    - 描述: 根据id删除一条up记录

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | id   | 主键 | number |


**table structure**

| 字段 | 描述 | 类型 |
| ---- | ---- | ---- |
|  id    |  主键    |  int    |
|   mid   |   up主id   |   String   |
|   name   |   up主名   |   String   |


## User


- `/user/get`

    - 请求方式: get
    
    - 描述: 获取用户分页列表

    - 参数:

      | 字段 | 描述   | 类型   |
      | ---- | ------ | ------ |
      | start   |  起始页(从0开始)   | number |
      | size  | 每页大小 | number |
    

- `/user/all`

    - 请求方式: get

    - 描述: 获取全部用户数据

    - 参数: 无
    

- `/user/getById`

    - 请求方式: get
    
    - 描述: 根据Id查询用户信息

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | id   | 主键 | number |


- `/user/getByName`

    - 请求方式: get

    - 描述: 根据用户名查询用户信息

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | name   | 用户名 | string |


- `/user/exist`

    - 请求方式: get

    - 描述: 查询数据库中是否存在同名用户

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | name   | 用户名 | string |
    

- `/user/check`

    - 请求方式: post

    - 描述: 查询用户密码并返回

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | name   | 用户名 | string |


- `/user/add`

    - 请求方式: post

    - 描述: 增加用户

    - 参数:

      | 字段 | 描述   | 类型   |
      | ---- | ------ | ------ |
      | name   | 用户名   | string |
      | password  | 密码 | string |
      | gender(可选) | 性别 | string |
      | location(可选) | 地区 | string |
      | birthday(可选) | 出生日期 | string |


- `/user/update`

    - 请求方式: post

    - 描述: 根据Id更新用户信息

    - 参数:

      | 字段 | 描述   | 类型   |
      | ---- | ------ | ------ |
      | id  | 用户Id | number |
      | name(可选)   | 用户名   | string |
      | gender(可选) | 性别 | string |
      | location(可选) | 地区 | string |
      | birthday(可选) | 出生日期 | string |


- `/user/delete`

    - 请求方式: post

    - 描述: 根据Id删除用户

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | id   | 主键 | number |


**table structure**

| 字段 | 描述 | 类型 |
| ---- | ---- | ---- |
|  id    |  用户id    |  int    |
|   name   |   用户名   |   String   |
|   password   |   密码   |   String   |
|   role   | 角色(用户\|管理员) | String |
|   location   |   地区   |   String   |
|   birthday   |   出生日期(yyyy-MM-dd)   |   String   |
|   gender   |   性别   |   String   |
|   created   |   注册时间(yyyy-MM-dd HH:mm:ss)   |   String   |


-----


## UList


- `/ulist/get`

    - 描述: 获取up列表(详细信息)

    - 参数:

      | 字段 | 描述   | 类型   |
      | ---- | ------ | ------ |
      | start   |  起始页(从0开始)   | number |
      | size  | 每页大小 | number |


- `/ulist/getByMid`

    - 描述: 根据mid查询up详细信息

    - 参数:

      | 字段 | 描述 | 类型   |
                                                          | ---- | ---- | ------ |
      | mid   | up主id | string |


**table structure**

| 字段 | 描述 | 类型 |
| ---- | ---- | ---- |
|  id    |  主键    |  int    |
| mid   | up主id | String |
|   name   |   up主名   |   String   |
|   face   |   up主头像   |   String   |
|   gender   |   性别   |   String   |
|   fans   |   粉丝数   |   int   |
|   sign   |   签名   |   String   |
|   title   |   认证词条   |   String   |
|   page   |   视频页数(每页30个)   |   int   |


## VList


- `/vlist/get`

    - 描述: 获取所有视频

    - 参数:

      | 字段 | 描述   | 类型   |
      | ---- | ------ | ------ |
      | start   |  起始页(从0开始)   | number |
      | size  | 每页大小 | number |


- `/vlist/getByMid`

    - 描述: 查询单个up主的全部视频

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | mid   | up主id | string |


- `/vlist/getByBvid`

    - 描述: 根据bvid查询单个视频信息

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | bvid   | 视频bv号 | string |


**table structure**

| 字段 | 描述 | 类型 |
| ---- | ---- | ---- |
|  id    |  主键    |  int    |
| bvid   | bv号 | String |
| mid   | 作者id | String |
|   author   |   作者名   |   String   |
|   title   |   视频标题   |   String   |
|   pic   |   视频封面   |   String   |
|   play   |   播放量   |   int   |
|   review   |   弹幕数   |   int   |
|   comment   |   评论数   |   int   |
|   length   |   时长   |   String   |
|   description   |   介绍   |   String   |
|   tm   |   时间(yyyy-MM-dd HH:mm:ss)   |   String   |

> 以上数据均来自爬虫，主要用于生成日志

[传送门](https://github.com/Meruem117/bilibili_spider)


-----


## MapReduce

> mapreduce分析结果

[传送门](https://github.com/Meruem117/mapreduce_count_text)


- `/chart/getMResult`

    - 描述: 获取分析后的所有结果

    - 参数: 无


- `/chart/getDistinctTm`

    - 描述: 获取分析后的不同的时间(yyyy-mm-dd)

    - 参数: 无


- `/chart/getMResultByType`

    - 描述: 根据类型获取分析结果

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | type   | 结果类型(1:up主,2:bv号,3:用户地区) | number |


- `/chart/getMResultByTypeAndTm`

    - 描述: 根据类型和时间获取分析结果

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | type   | 结果类型(1:up主,2:bv号,3:用户地区) | number |
      | tm   | 时间(yyyy-MM-dd) | string |


- `/chart/getMResultByNameAndTm`

    - 描述: 根据名称和时间获取分析结果

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | name   | 名称(up主名或bv号或用户地区) | number |
      | tm   | 时间(yyyy-MM-dd) | string |


**table structure**

| 字段 | 描述 | 类型 |
| ---- | ---- | ---- |
|  name    |  记录名    |  String    |
|  type  | 类别 | int |
|   count   |   总数   |   int   |
|   tm   |   时间(yyyy-MM-dd)   |   String   |


## Hive

> hive分析结果

[传送门](https://github.com/Meruem117/vite_vue3_start/blob/main/src/assets/Hive.md)


- `/chart/getHResult1`

    - 描述: 获取每年视频数

    - 参数: 无


- `/chart/getHResult2`

    - 描述: 获取每个作者不同时间(yyyy-mm)的视频数

    - 参数: 无


- `/chart/getHResult3`

    - 描述: 获取综合评分前40的视频列表

    - 参数: 无


- `/chart/getHResult4`

    - 描述: 获取播放破千万的视频列表

    - 参数: 无


**table structure**

Hive Result 1

| 字段 | 描述 | 类型 |
| ---- | ---- | ---- |
|  process_date    |  执行时间    |  String    |
|  year  | 年份 | String |
|   video_count   |   视频总数   |   int   |

Hive Result 2

| 字段 | 描述 | 类型 |
| ---- | ---- | ---- |
|  process_date    |  执行时间    |  String    |
|  author  | 作者 | String |
|   tm   |   时间(yyyy-MM)   |   String   |
|   count   |   视频数   |   int   |

Hive Result 3

| 字段 | 描述 | 类型 |
| ---- | ---- | ---- |
|  process_date    |  执行时间    |  String    |
|  bvid  | 视频bv号 | String |
|   mid   |   作者id   |   int   |
|   title   |   视频标题   |   String   |
|   author   |   作者名   |   String   |
|   pic   |   视频封面   |   String   |
|   play   |   播放量   |   int   |
|   review   |   弹幕数   |   int   |
|   score   |   评分   |   int   |

Hive Result 4

| 字段 | 描述 | 类型 |
| ---- | ---- | ---- |
|  process_date    |  执行时间    |  String    |
|  author  | 作者名 | String |
|  bvid  | 视频bv号 | String |
|   title   |   视频标题   |   String   |
|   play   |   播放量   |   int   |
|   tm   |   时间(yyyy-MM-dd HH:mm:ss)   |   String   |

> 以上用于获取大数据分析结果


-----


## Log

> 生成日志


- `/log/generateLog`

    - 描述: 批量生成日志

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | n   | 生成日志数 | number |


- `/log/addLog`

    - 描述: 记录一条日志

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | author   | up主名 | string |
      | bvid   | 视频bv号 | string |
      | location   | 用户地区 | string |


-----


## SSH2

> 与Linux虚拟机连接，并执行命令


- `/log/ls`

    - 描述: 执行`ls`

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | path | 虚拟机路径 | string |


- `/log/dfsls`

    - 描述: 执行`hdfs dfs -ls`

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | path | Hadoop路径 | string |


- `/log/flume`

    - 描述: 执行flume命令，将`log4j`生成的日志上传到`HDFS`

    - 参数: 无


- `/log/mapred`

    - 描述: 执行mapreduce程序

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | input | HDFS需要分析的文件路径 | string |


- `/log/sqoop`

    - 描述: 执行sqoop命令，将mapreduce分析结果导出到mysql

    - 参数:

      | 字段 | 描述 | 类型   |
      | ---- | ---- | ------ |
      | path | HDFS分析结果的路径 | string |
