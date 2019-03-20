package com.dlb.common

case class toJson (
                adType:String,
                analyticId:String,
                androidId:String,
                bdCpu:String,
                bdModel:String,
                blockId:String,
                buildBoard:String,
                channel:String,
                cid:Long,
                city:String,
                cityCode:String,
                country:String,
                cpuCnt:Long,
                cpuName:String,
                definition:String,
                deviceId:String,
                deviceName:String,
                dpi:Long,
                duration:Long,
                endTime:Long,
                entry1:String,
                entry1Id:String,
                eth0Mac:String,
                eventKey:String,
                eventName:String,
                eventType:String,
                eventValue:String,
                index:Long,
                ip:String,
                ipaddr:String,
                isVip:Boolean,
                isp:String,
                kafkaTopic:String,
                largeMem:Long,
                limitMem:Long,
                name:String,
                nameId:String,
                openId:String,
                optType:String,
                page:String,
                pkg:String,
                pluginPkg:String,
                pluginVercode:Long,
                pos:Long,
                prePage:String,
                prevue:Long,
                province:String,
                rectime:Long,
                screen:String,
                serial:String,
                session:String,
                site:String,
                specId:Long,
                subName:String,
                time:Long,
                topic:String,
                topicCid:String,
                topicId:String,
                topicType:String,
                touch:Boolean,
                uid:String,
                url:String,
                uuid:String,
                verCode:Long,
                verName:String,
                wlan0Mac:String,
                x:String,
                y:String
)

case class sendPara(secret: String,
                    publicKey: String,
                    dataHash:String,
                    dataType:String,
                    dataAmount:String)