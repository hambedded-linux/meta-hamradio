SUMMARY = "APRS Digipeater and iGate"
DESCRIPTION = "Aprx is an APRS specific Digipeater and iGate. \
It supports multiple KISS-TNCs on serial ports  and listening \
to any kernel AX.25 network interfaces. \
\
Additional features include a built-in 'erlang-monitor' to analyze \
activity level of radio channels. \
\
This software requires a valid (and unique) ham radio callsign to \
operate fully and is therefore useful mainly for licensed radio \
amateurs."

HOMEPAGE = "http://wiki.ham.fi/Aprx.en"
# FIXME: what's the license? It is as-is. I put GPL-2.0 to be able to
# compile.
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0b06e70bf9d783402903f4120ec96dc6"

# DEPENDS: This package only depends on libc. While the package is being
# written, the dependency is added automatically. What if it's compiled
# with uclibc? See what features it needs for working correctly and set
# relevant dependency relation if needed.

SVN_REV = "514"
SRC_VER = "2.06"

PR = "r0"
PV = "${SRC_VER}+svnr${SVN_REV}"

S = "${WORKDIR}/${PN}-${SRC_VER}.svn${SVN_REV}"

SRC_URI = "http://ham.zmailer.org/oh2mqk/aprx/aprx-${SRC_VER}.svn${SVN_REV}.tar.gz \
"

SRC_URI[md5sum] = "9a842028baea4cbab00b3a3f7d008452"
SRC_URI[sha256sum] = "8efcbe464f6da2750c18f1ae56f14a0aa8d039491a4ed06b2fc671a1700f4676"

EXTRA_OECONF = " \
    --disable-agwpe \
    "

# Use our compiler as a linker. Aprx uses LD directly to link but
# LDFLAGS are set for compiler. ${HOST_PREFIX}ld complains about
# unrecognized options such as -Wl,-O1
LD = "${CC}"

inherit autotools
