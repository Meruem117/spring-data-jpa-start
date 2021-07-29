# Springboot_JPA_start

A springboot project using jpa and log4j.

**关联项目**

[Vue前端(待优化)](https://github.com/Meruem117/vite_vue3_start)

[React前端(前端完成，后台图表正在进行)](https://github.com/Meruem117/react_ant_start)

[爬虫](https://github.com/Meruem117/bilibili_spider)

[Mapreduce](https://github.com/Meruem117/mapreduce_count_text)

> 以下简记，非标记则为必填

## Up

> 主要接口

- `/api/getUp`
  - 描述: 获取up列表
  - 参数: 无
- `/api/addUp`
  - 描述: 增加一条记录
  - 参数: 
    | 字段 | 描述   | 类型   |
    | ---- | ------ | ------ |
    | id   | 主键   | number |
    | mid  | up主id | string |
    | name | up主名 | string |
- `/api/deleteUp`
  - 描述: 根据Id删除up信息
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | id   | 主键 | number |
- `/api/updateUp`
  - 描述: 修改up信息
  - 参数: 
    | 字段 | 描述   | 类型   |
    | ---- | ------ | ------ |
    | id   | 主键   | number |
    | mid(可选)  | up主id | string |
    | name(可选) | up主名 | string |

## User

> 用的不多

- `/api/getUser`
  - 描述: 获取用户列表
  - 参数: 无
- `/api/getUserById`
  - 描述: 根据Id查询用户信息
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | id   | 主键 | number |
- `/api/getUserByName`
  - 描述: 根据用户名查询用户信息
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | name   | 用户名 | string |
- `/api/checkUser`
  - 描述: 查询用户密码并返回
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | name   | 用户名 | string |
- `/api/addUser`
  - 描述: 增加用户
  - 参数: 
    | 字段 | 描述   | 类型   |
    | ---- | ------ | ------ |
    | name   | 用户名   | string |
    | password  | 密码 | string |
    | gender(可选) | 性别 | string |
    | location(可选) | 地区 | string |
    | birthday(可选) | 出生日期 | string |
- `/api/deleteUserById`
  - 描述: 根据Id删除用户
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | id   | 主键 | number |
- `/api/updateUser`
  - 描述: 根据Id更新用户信息
  - 参数: 
    | 字段 | 描述   | 类型   |
    | ---- | ------ | ------ |
    | id  | 用户Id | number |
    | name(可选)   | 用户名   | string |
    | gender(可选) | 性别 | string |
    | location(可选) | 地区 | string |
    | birthday(可选) | 出生日期 | string |


> 以上前端相关

-----

## UList

> 爬虫爬取，存在数据库中，未用到

- `/api/getUList`
  - 描述: 获取up列表(详细信息)
  - 参数: 无
- `/api/getUpByMid`
  - 描述: 根据mid查询up详细信息
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | mid   | up主id | string |

## VList

> 爬虫爬取，用于批量生成假日志

- `/api/getVList`
  - 描述: 获取所有视频
  - 参数: 无
- `/api/getVListByMid`
  - 描述: 查询单个up主的全部视频
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | mid   | up主id | string |
- `/api/getVideoByBvid`
  - 描述: 根据bvid查询单个视频信息
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | bvid   | 视频bv号 | string |


> 以上数据均来自爬虫，主要用于生成日志
[传送门](https://github.com/Meruem117/bilibili_spider)

-----

## MapReduce

> mapreduce分析结果
[传送门](https://github.com/Meruem117/mapreduce_count_text)

- `/api/getMResult`
  - 描述: 获取分析后的所有结果
  - 参数: 无
- `/api/getDistinctTm`
  - 描述: 获取分析后的不同的时间(yyyy-mm-dd)
  - 参数: 无
- `/api/getMResultByType`
  - 描述: 根据类型获取分析结果
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | type   | 结果类型(1:up主,2:bv号,3:用户地区) | number |
- `/api/getMResultByTypeAndTm`
  - 描述: 根据类型和时间获取分析结果
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | type   | 结果类型(1:up主,2:bv号,3:用户地区) | number |
    | tm   | 时间(yyyy-mm-dd) | string |
- `/api/getMResultByNameAndTm`
  - 描述: 根据名称和时间获取分析结果
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | name   | 名称(up主名或bv号或用户地区) | number |
    | tm   | 时间(yyyy-mm-dd) | string |

## Hive

> hive分析结果
[传送门](https://github.com/Meruem117/vite_vue3_start/blob/main/src/assets/Hive.md)

- `/api/getHResult1`
  - 描述: 获取每年视频数
  - 参数: 无
- `/api/getHResult2`
  - 描述: 获取每个作者不同时间(yyyy-mm)的视频数
  - 参数: 无
- `/api/getHResult3`
  - 描述: 获取综合评分前40的视频列表
  - 参数: 无
- `/api/getHResult4`
  - 描述: 获取播放破千万的视频列表
  - 参数: 无


> 以上用于获取大数据分析结果

-----

## Log

> 生成日志

- `/api/generateLog`
  - 描述: 批量生成日志
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | n   | 生成日志数 | number |
- `/api/addLog`
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

- `/api/ls`
  - 描述: 执行`ls`
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | path | 虚拟机路径 | string |
- `/api/dfsls`
  - 描述: 执行`hdfs dfs -ls`
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | path | Hadoop路径 | string |
- `/api/flume`
  - 描述: 执行flume命令，将`log4j`生成的日志上传到`HDFS`
  - 参数: 无
- `/api/mapred`
  - 描述: 执行mapreduce程序
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | input | HDFS需要分析的文件路径 | string |
- `/api/sqoop`
  - 描述: 执行sqoop命令，将mapreduce分析结果导出到mysql
  - 参数:
    | 字段 | 描述 | 类型   |
    | ---- | ---- | ------ |
    | path | HDFS分析结果的路径 | string |
