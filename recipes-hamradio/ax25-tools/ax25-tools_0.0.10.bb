SUMMARY = "Tools for AX.25 interface configuration"
DESCRIPTION = " These are hamradio specific tools for setting up and \
configuring hamradio ports that use AX.25 Net/ROM or ROSE network \
protocols. \
"

HOMEPAGE = "http://www.linux-ax25.org/"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "libax25"
RRECOMMENDS_${PN} = "kernel-module-ax25 kernel-module-mkiss"

MINOR_VERSION = "rc4"
PR = "r0"

S = "${WORKDIR}/${PN}-${PV}-${MINOR_VERSION}"

SRC_URI = "http://www.linux-ax25.org/pub/ax25-tools/${PN}-${PV}-${MINOR_VERSION}.tar.gz \
           file://axports \
"

SRC_URI[md5sum] = "c90e3cbe70499a87b2b47d782a577b5d"
SRC_URI[sha256sum] = "d36ad473f8261ea91dbef105d7493890774f2d1d03a485b86ddd23cbed597e20"

inherit autotools

do_install_append() {
    install -d ${D}${sysconfdir}/ax25/
    install -m 0744 ${WORKDIR}/axports ${D}${sysconfdir}/ax25/axports
}
