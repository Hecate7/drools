salience:优先级
不设置，则执行顺序规则是随机的

no-loop：防止死循环
当对Fact对象进行了修改，引擎会再次检查所有的规则是否满足条件，如果满足条件会再次执行

date-effective：日期≤

date-expires：日期>

enabled：是否可用

lock-on-active：规则只执行一次

activation-group "groupName"：分组
具有相同activation-group属性名的规则，只有一个规则会被执行，其他规则都不会执行

agenda-group：议程分组
需要显示指定Agenda Group得到了Focus，否则将不执行
agenda-group "group1"
session.getAgenda().getAgendaGroup("group1").setFocus();

auto-focus：焦点分组
在已设置了agenda-group的规则上设置该规则是否可以自动读取Focus

ruleflow-group


#

## Drools 函数
insert-将fact对象插入working memory中
一旦调用insert函数，Drools会重新与所有的规则再重新匹配一次

insertLogical

update

retract
