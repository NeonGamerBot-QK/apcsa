const fs = require('fs')

const filesWhichAreDirs = fs.readdirSync('./').filter(file => fs.lstatSync(file).isDirectory())

const projectsInMd = filesWhichAreDirs.filter(dir => {
    if (['.github', 'target'].includes(dir)) return false;
    return true;
}).map(dir => `- [**${dir}**](./${dir}/README.md)`).join('\n')

fs.writeFileSync('./README.md', fs.readFileSync('./README.template').toString().replace('{content}', projectsInMd))

require('child_process').execSync('git add . && git commit -m "ci(zeon): Update README.md" && git push')