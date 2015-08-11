Boot中的Boot Mode里的UEFI和Legacy Support选项是什么意思？

两种不同的引导方式,
uefi是新式的BIOS，legacy是传统BIOS
你在UEFI模式下安装的系统，只能用UEFI模式引导；同理，如果你是在Legacy模式下安装的系统，也只能在legacy模式下进系统。uefi只支持64为系统且磁盘分区必须为gpt模式，传统BIOS使用Int 13中断读取磁盘，每次只能读64KB，非常低效，而UEFI每次可以读1MB，载入更快。
此外，Win8，更是进一步优化了UEFI支持，号称可以实现瞬时开机。
