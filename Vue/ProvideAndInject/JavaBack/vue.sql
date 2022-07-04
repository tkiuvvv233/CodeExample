SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '学号',
  `stuName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `ifOut` int NULL DEFAULT NULL COMMENT '是否离校',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '学生信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('202000000001', '张三', 1, '男');
INSERT INTO `user` VALUES ('202000000002', '李四', 1, '女');
INSERT INTO `user` VALUES ('202000000003', '王五', 0, '男');
INSERT INTO `user` VALUES ('202000000004', '琴柳', 1, '女');
INSERT INTO `user` VALUES ('202000000005', '七七', 0, '女');

SET FOREIGN_KEY_CHECKS = 1;
