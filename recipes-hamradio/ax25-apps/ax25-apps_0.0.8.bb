SUMMARY = "AX.25 hamradio applications"
DESCRIPTION = "This package provides specific user applications for hamradio \
that use AX.25 Net/ROM or ROSE network protocols: \
\
 * axcall: a general purpose AX.25, NET/ROM and ROSE connection  \
   program. \
 * axlisten: a network monitor of all AX.25 traffic heard by the system. \
 * ax25ipd: an RFC1226 compliant daemon which provides \
   encapsulation of AX.25 traffic over IP. \
 * ax25mond: retransmits data received from sockets into an AX.25 \
   monitor socket. \
"

HOMEPAGE = "http://www.linux-ax25.org/"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "libax25 ncurses"

MINOR_VERSION = "rc4"
PR = "r0"

S = "${WORKDIR}/${PN}-${PV}-${MINOR_VERSION}"

SRC_URI = "http://www.linux-ax25.org/pub/ax25-apps/${PN}-${PV}-${MINOR_VERSION}.tar.gz \
"

SRC_URI[md5sum] = "23b699a043d15e4ddce2927a65782a50"
SRC_URI[sha256sum] = "0e031721a440cc169768080f1d6bea32ef1d2a9c80a754ae5239738f9ab8fe0a"

inherit autotools
