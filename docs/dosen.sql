
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dosen
-- ----------------------------
DROP TABLE IF EXISTS `dosen`;
CREATE TABLE `dosen` (
  `iddosen` varchar(10) NOT NULL,
  `namadosen` varchar(20) NOT NULL,
  `alamatdosen` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`iddosen`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of dosen
-- ----------------------------
INSERT INTO `dosen` VALUES ('002', 'Edwin', 'Ciledug');
