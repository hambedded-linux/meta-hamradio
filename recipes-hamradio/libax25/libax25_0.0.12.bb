SUMMARY = "AX.25 library for hamradio applications"
DESCRIPTION = "Libax25 is for ham radio applications that use ax.25 \
protocol. Included are routines to do ax.25 address parsing, common \
ax25 application config file parsing, etc. \
"

HOMEPAGE = "http://www.linux-ax25.org/"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://COPYING;md5=dcf3c825659e82539645da41a7908589"

MINOR_VERSION = "rc4"
PR = "r0"

S = "${WORKDIR}/${PN}-${PV}-${MINOR_VERSION}"

SRC_URI = "http://www.linux-ax25.org/pub/libax25/${PN}-${PV}-${MINOR_VERSION}.tar.gz \
"

SRC_URI[md5sum] = "9b2e6890ef20dd0cf8ac7fdb22e6a4b6"
SRC_URI[sha256sum] = "051bd736c3f3f3b242b3efea91af37f2e8d5afaebb5fe6e1df050bb1f6aeb986"

inherit autotools
